# Quantum Car - Fawry Internship Challenge

Simple Java project that simulates a car factory with replaceable engines.

## Features

- Car engine can be replaced easily.
- Supported engines:
  - `GasolineEngine`
  - `ElectronicEngine`
  - `MixedHybridEngine` (hybrid)
- Car operations:
  - `start` (starts at speed 0)
  - `stop` (car speed goes to 0 before stopping)
  - `accelerate` (+20 km/h, max 200)
  - `brake` (-20 km/h, min 0)
- Engine operations:
  - `increase` (+1 km/h)
  - `decrease` (-1 km/h)
- Car always syncs engine speed with current car speed.
- Hybrid rule:
  - below 50 km/h -> `ElectronicEngine`
  - 50 km/h and above -> `GasolineEngine`
  - only one engine works at a time (cost optimized)

## Project Files

- `Main.java` - demo and testing
- `Car.java` - car logic and operations
- `Engine.java` - engine interface
- `GasolineEngine.java` - gasoline engine
- `ElectronicEngine.java` - electronic engine
- `MixedHybridEngine.java` - hybrid engine logic
- `CarFactory.java` - create/replace engines

## How to Run

Open terminal in this folder:

`c:\Users\HanyM\OneDrive\Desktop\Fawry`

Then run:

```powershell
javac *.java
java Main
```

## Notes

- Design is intentionally simple.
- `Main` demonstrates all car types and engine replacement.
