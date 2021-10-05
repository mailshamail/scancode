package mailshamail.ru;


import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Package{

    public String name;
    public double size;
    public boolean isSystem;
    private PackageManager pm;

    public Package(PackageManager pm){
        this.pm = pm;
    }

    private boolean isSystem(ApplicationInfo s) {
        boolean system = false;
        if ((s.flags & ApplicationInfo.FLAG_SYSTEM) != 0)
            system = true;
        return system;
    }

    private double getSize(ApplicationInfo s) {
        File file = new File(s.publicSourceDir);
        return file.length()/1000;
    }

    public List getAllPackages(){

        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        List<List> result = new ArrayList<>();
        for (ApplicationInfo packageInfo : packages) {
            name = packageInfo.packageName;
            size = getSize(packageInfo);
            isSystem = isSystem(packageInfo);
            if (isSystem)
                name += " (Системное приложение)";
            result.add(Collections.singletonList(name));
            result.add(Collections.singletonList(size));
        }

        return result;
    }
}
