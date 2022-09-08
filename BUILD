load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "main",
    srcs = glob(["*.scala"]),
    main_class = "HelloWorld",
    deps = ["//lib"],
)
