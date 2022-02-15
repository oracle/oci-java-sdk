/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A single instruction to be included as part of Patch request content.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation",
    defaultImpl = PatchInstruction.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PatchRemoveInstruction.class,
        name = "REMOVE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PatchInsertInstruction.class,
        name = "INSERT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PatchMergeInstruction.class,
        name = "MERGE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PatchInstruction {

    /**
     * The set of values to which the operation applies as a [JMESPath expression](https://jmespath.org/specification.html) for evaluation against the context resource. An operation fails if the selection yields an exception, except as otherwise specified. Note that comparisons involving non-primitive values (objects or arrays) are not supported and will always evaluate to false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selection")
    String selection;

    /**
     * The patch operation.
     **/
    public enum Operation {
        Insert("INSERT"),
        Remove("REMOVE"),
        Merge("MERGE"),
        ;

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operation: " + key);
        }
    };
}
