# Gradle
## Problems
1. ``` sh 
   Execution failed for task ':app:checkDebugDuplicateClasses'. Chucker
   ```
   *Solution*: Change from ``implementation(libs.com.github.chuckerteam.chucker.library)
   implementation(libs.com.github.chuckerteam.chucker.library.no.op)`` to ``debugImplementation(libs.com.github.chuckerteam.chucker.library) releaseImplementation(libs.com.github.chuckerteam.chucker.library.no.op)``
2. ``` sh 
   Duplicate class org.intellij.lang.annotations.Identifier found in modules annotations-12.0.jar -> annotations-12.0 (com.intellij:annotations:12.0) and annotations-23.0.0.jar -> annotations-23.0.0 (org.jetbrains:annotations:23.0.0)
   ```
   *Solution*: Change from ``implementation(libs.androidx.room.compiler)`` to ``annotationProcessor(libs.com.github.chuckerteam.chucker.library) releaseImplementation(libs.com.github.chuckerteam.chucker.library.no.op)``
