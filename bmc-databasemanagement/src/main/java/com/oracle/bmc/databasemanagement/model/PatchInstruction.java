/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A single instruction to be included as part of Patch request content. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation",
        defaultImpl = PatchInstruction.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PatchMergeInstruction.class,
            name = "MERGE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PatchInstruction extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"selection"})
    protected PatchInstruction(String selection) {
        super();
        this.selection = selection;
    }

    /**
     * The set of values to which the operation applies as a [JMESPath
     * expression](https://jmespath.org/specification.html) for evaluation against the context
     * resource. An operation fails if the selection yields an exception, except as otherwise
     * specified. Note that comparisons involving non-primitive values (objects or arrays) are not
     * supported and will always evaluate to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selection")
    private final String selection;

    /**
     * The set of values to which the operation applies as a [JMESPath
     * expression](https://jmespath.org/specification.html) for evaluation against the context
     * resource. An operation fails if the selection yields an exception, except as otherwise
     * specified. Note that comparisons involving non-primitive values (objects or arrays) are not
     * supported and will always evaluate to false.
     *
     * @return the value
     */
    public String getSelection() {
        return selection;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PatchInstruction(");
        sb.append("super=").append(super.toString());
        sb.append("selection=").append(String.valueOf(this.selection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchInstruction)) {
            return false;
        }

        PatchInstruction other = (PatchInstruction) o;
        return java.util.Objects.equals(this.selection, other.selection) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.selection == null ? 43 : this.selection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of operation. */
    public enum Operation implements com.oracle.bmc.http.internal.BmcEnum {
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
