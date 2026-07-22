# HTML Tester App

A simple Android app that lets you test and preview HTML code in real-time.

## Features

- ✅ Enter HTML code in a text editor
- ✅ Preview rendered HTML instantly
- ✅ Support for CSS and JavaScript
- ✅ Clean and user-friendly interface

## Requirements

- Android Studio (Latest version recommended)
- Android SDK 24 or higher
- Gradle 8.1.0 or higher

## Building the APK

### Method 1: Using Android Studio
1. Open Android Studio
2. Click **File** → **Open** and select this project folder
3. Wait for Gradle to sync
4. Click **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
5. The APK will be generated in `app/build/outputs/apk/debug/`

### Method 2: Using Command Line
```bash
# Clone the repository
git clone https://github.com/Mouyadb/Html---tester-.git
cd Html---tester-

# Build the APK
./gradlew assembleDebug

# The APK will be at: app/build/outputs/apk/debug/app-debug.apk
```

## Installation

1. Enable "Unknown Sources" in your Android device settings
2. Transfer the APK file to your device or use:
   ```bash
   ./gradlew installDebug
   ```
3. Open the APK and install it

## Usage

1. Launch the app
2. Enter your HTML code in the input field
3. Tap **"Render HTML"** to preview your code
4. The preview will display below

## Example HTML

```html
<!DOCTYPE html>
<html>
<head>
    <style>
        body { font-family: Arial; }
        h1 { color: blue; }
    </style>
</head>
<body>
    <h1>Hello World!</h1>
    <p>This is a test.</p>
</body>
</html>
```

## Project Structure

```
Html---tester-/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/mouyad/htmltester/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── values/
│   │   │   │   └── drawable/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## Troubleshooting

### App crashes on startup
- Make sure you have INTERNET permission enabled (already in AndroidManifest.xml)
- Check the logcat for detailed error messages

### WebView not rendering
- Ensure JavaScript is enabled in settings (enabled by default)
- Check your HTML syntax for errors

### APK too large
- Run `./gradlew assembleRelease` for a smaller release build

## License

Open source project - feel free to modify and distribute!

## Author

Created by Mouyad
