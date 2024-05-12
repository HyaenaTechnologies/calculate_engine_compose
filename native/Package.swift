// swift-tools-version: 5.10
import PackageDescription

let package = Package(
    name: "calculate_engine",
    products: [
        .executable(
            name: "calculate_engine_executable",
            targets: ["calculate_engine_target"]
        ),
    ],
    dependencies: [
        .package(
            url: "https://github.com/apple/swift-algorithms", 
            from: "1.2.0"
        ),
        .package(
            url: "https://github.com/apple/swift-argument-parser", 
            from: "1.3.1"
        ),
        .package(
            url: "https://github.com/apple/swift-async-algorithms", 
            from: "1.0.0"
        ),
        .package(
            url: "https://github.com/apple/swift-collections", 
            from: "1.1.0"
        ),
        .package(
            url: "https://github.com/apple/swift-log", 
            from: "1.5.4"
        ),
        .package(
            url: "https://github.com/apple/swift-metrics", 
            from: "2.4.1"
        ),
        .package(
            url: "https://github.com/apple/swift-metrics-extras", 
            from: "0.3.1"
        ),
        .package(
            url: "https://github.com/apple/swift-numerics", 
            from: "1.0.2"
        ),
        .package(
            url: "https://github.com/apple/swift-system", 
            from: "1.2.1"
        ),
        .package(
            url: "https://github.com/apple/swift-testing", 
            from: "0.7.0"
        ),
    ],
    targets: [
        .executableTarget(
            name: "calculate_engine_target", 
            dependencies: [
                .product(
                    name: "Algorithms", 
                    package: "swift-algorithms"
                ),
                .product(
                    name: "ArgumentParser", 
                    package: "swift-argument-parser"
                ),
                .product(
                    name: "AsyncAlgorithms", 
                    package: "swift-async-algorithms"
                ),
                .product(
                    name: "Collections", 
                    package: "swift-collections"
                ),
                .product(
                    name: "Logging", 
                    package: "swift-log"
                ),
                .product(
                    name: "Metrics", 
                    package: "swift-metrics"
                ),
                .product(
                    name: "Numerics", 
                    package: "swift-numerics"
                ),
                .product(
                    name: "SystemPackage", 
                    package: "swift-system"
                ),
                .product(
                    name: "Testing", 
                    package: "swift-testing"
                ),
        ]),
        .testTarget(
            name: "cli_test",
            dependencies: ["calculate_engine_target"]
        ),
    ]
)