# Oracle Cloud Infrastructure SDK for Java Examples: Jersey 3

Please compile the `bmc-other-examples/bmc-jersey3-examples` module before running any example, specially if it is your first time working with the examples. Failure to do so can lead to exception like `ClassNotFoundException`. You can compile the source code of the examples as below:
```
mvn compile -pl bmc-other-examples/bmc-jersey3-examples
```

You may run any example by invoking the `exec:java` goal and passing appropriate values for `exec.mainClass` and `exec.args` properties,
for example: `ObjectStorageGetBucketExample` class requires 3 arguments which are OCID of the compartment, name of bucket, name of object. This example class can be executed as follows:

```
mvn -am -pl bmc-other-examples/bmc-jersey3-examples exec:java \
  -Dexec.mainClass=ObjectStorageGetBucketExample \
  -Dexec.args="compartment_ocid bucket_name object_name"
```

You can also compile and run the example at the same time by doing the following:

```
mvn clean compile -am -pl bmc-other-examples/bmc-jersey3-examples exec:java \
  -Dexec.mainClass=ObjectStorageGetBucketExample \
  -Dexec.args="compartment_ocid bucket_name object_name"
```

where `compartment_id`, `bucket_name`, and `object_name` should be substituted with appropriate values according to your setup.
