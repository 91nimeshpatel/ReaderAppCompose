# ReaderAppCompose 📚

A modern Android reading tracker application built with Jetpack Compose and Clean Architecture, integrating with Google Books API and Firebase services.

## Features ✨

- **User Authentication** 🔒
  - Email/password login and registration
  - Firebase Authentication integration
  - User session management

- **Book Management** 📖
  - Search books using Google Books API
  - Save books to personal library
  - Track reading progress (To Read/Reading/Read)
  - Add notes and ratings
  - Update reading status with timestamps

- **Reading Analytics** 📊
  - Track books read/reading statistics
  - View reading history timeline
  - See personal reading achievements

- **Modern Architecture** 🏗️
  - Clean Architecture implementation
  - MVVM pattern with Jetpack Compose
  - Repository pattern for data management

## Tech Stack 🛠️

- **UI**: Jetpack Compose, Material 3
- **Authentication**: Firebase Auth
- **Database**: Cloud Firestore
- **DI**: Hilt
- **Async**: Kotlin Coroutines, Flow
- **Networking**: Retrofit, Google Books API
- **Build**: Gradle (KTS)
- **Architecture**: Clean Architecture, MVVM

## Screenshots 📱
| Login Screen | Book Search | Reading List |
|--------------|-------------|--------------|
| <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/LoginandRegistration.png" width="250"> | <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/BookSearch.png" width="250"> | <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/ReadingList.png" width="250"> |

| Book Details | Reading Progress | Activity Stats |
|--------------|-------------------|----------------|
| <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/BookDetails.png" width="250"> | <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/ReadingProgress.png" width="250"> | <img src="https://github.com/91nimeshpatel/ReaderAppCompose/raw/master/screenshot/ActivityStatus.png" width="250"> |
## Installation ⚙️

1. **Clone the repository:**
  ```bash
  git clone https://github.com/91nimeshpatel/ReaderAppCompose.git 
  ```
2. **Add Firebase Configuration**
- Download google-services.json from your Firebase console
- Place it in app/ directory

3. **Google Books API**:
  ```bash
  https://www.googleapis.com/books/v1/volumes/?q=android
  ```
**4. Build & Run**
  ```bash
   ./gradlew assembleDebug
  ```

## Project Structure 🧱 
  ```bash
          📁 ReaderAppCompose
        ├── 📁 app
        │   └── 📁 src/main/java/com/readerappcompose
        │       ├── 📁 data                # Data layer
        │       │   ├── remote            # Firebase/API sources
        │       │   └── repository        # Data repositories
        │       │
        │       ├── 📁 domain             # Business logic
        │       │   ├── model             # Data models
        │       │   └── use_case          # Use cases
        │       │
        │       ├── 📁 presentation       # UI layer
        │       │   ├── components        # Reusable UI components
        │       │   ├── navigation        # Navigation graphs
        │       │   ├── screens           # App screens
        │       │   └── viewmodel         # ViewModels
        │       │
        │       └── di                    # Dependency Injection (Hilt)
        │
        ├── 📁 gradle                     # Build configuration
        └── 📄 build.gradle.kts           # Module-level dependencies
   ```

