name := "native-bug"

scalaVersion := "2.11.8"

enablePlugins(RpmPlugin)
rpmVendor in Rpm := "native-bug"
rpmLicense in Rpm := Some("native-bug")
