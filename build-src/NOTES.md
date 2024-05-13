# Notes: build-src
## How to create initial state (empty) build-src:convention step by step
1. Create module build-src
2. Create module convention
3. Delete all file and folder in build-src except convention module
4. Change the code inside build.gradle.kts in convention module 
   ``` sh 
   plugins {
       `kotlin-dsl`
   }

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_17.toString()
        }
    }
    
    dependencies {
    
    }
   ```
5. Create file ``settings.gradle.kts`` inside build src and add this code:
   ``` sh 
   dependencyResolutionManagement {
       repositories {
           google()
           mavenCentral()
       }
       versionCatalogs {
           create("libs") {
               from(files("../gradle/libs.versions.toml"))
           }
       }
   }

   rootProject.name = "build-src"
   include(":convention")
   ```
6. Rebuild th project