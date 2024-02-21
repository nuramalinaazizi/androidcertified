package com.nuramalinalee.ncanvas.util

import android.content.Context
import android.content.pm.PackageManager
import com.nuramalinalee.ncanvas.BuildConfig


class VersionUtil {
    fun getCurrentVersion(context: Context): String {
        try {
            var flavor = BuildConfig.FLAVOR
            val buildType = BuildConfig.BUILD_TYPE

            flavor = "-$flavor-$buildType"

            return context.packageManager.getPackageInfo(
                context.packageName,
                0
            ).versionName + flavor
        } catch (ex: PackageManager.NameNotFoundException) {
            ex.printStackTrace()
        }

        return ""
    }
}