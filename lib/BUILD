load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "lib",
    srcs = ["Lib.scala"],
    visibility = ["//visibility:public"],
    deps = [
        "@3p//:com_fasterxml_jackson_core_jackson_core",
    ],
)
