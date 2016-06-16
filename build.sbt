import RhoBuild._

version       in ThisBuild := s"0.12.0${scalazCrossBuildSuffix(scalazVersion.value)}"
apiVersion    in ThisBuild <<= version.map(extractApiVersion)
scalazVersion in ThisBuild := "7.1.7"
