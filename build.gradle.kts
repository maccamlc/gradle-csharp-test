plugins {
    id("com.itiviti.dotnet") version "1.7.2"
}

repositories {
    mavenCentral()
}

dotnet {
    solution = "gradle-csharp.sln"
}
