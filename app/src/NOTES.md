# App Notes
## Bottom navigation
- Please take note that the `id` of the menu items have to match the `id` of the graph destination.
- Android API >=30, UI keep spacing for bottom navigation UI even when it's hidden the spacing is called inset bottom, you set it to 0, add following kotlin's code on `onViewCreated()`
  ```sh 
  binding.bottomNavigationView.setOnApplyWindowInsetsListener { view, insets ->
        view.updatePadding(bottom = 0)
        insets
    }
  ```
- 