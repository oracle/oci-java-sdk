/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Holder for parameters names.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CallOperationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CallOperationConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inFields",
        "outFields",
        "callAttribute",
        "pushDownOperations"
    })
    public CallOperationConfig(
            java.util.List<String> inFields,
            java.util.List<String> outFields,
            AbstractCallAttribute callAttribute,
            java.util.List<PushDownOperation> pushDownOperations) {
        super();
        this.inFields = inFields;
        this.outFields = outFields;
        this.callAttribute = callAttribute;
        this.pushDownOperations = pushDownOperations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of names of IN/INOUT parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inFields")
        private java.util.List<String> inFields;

        /**
         * List of names of IN/INOUT parameters.
         * @param inFields the value to set
         * @return this builder
         **/
        public Builder inFields(java.util.List<String> inFields) {
            this.inFields = inFields;
            this.__explicitlySet__.add("inFields");
            return this;
        }
        /**
         * List of names of OUT/INOUT parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outFields")
        private java.util.List<String> outFields;

        /**
         * List of names of OUT/INOUT parameters.
         * @param outFields the value to set
         * @return this builder
         **/
        public Builder outFields(java.util.List<String> outFields) {
            this.outFields = outFields;
            this.__explicitlySet__.add("outFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
        private AbstractCallAttribute callAttribute;

        public Builder callAttribute(AbstractCallAttribute callAttribute) {
            this.callAttribute = callAttribute;
            this.__explicitlySet__.add("callAttribute");
            return this;
        }
        /**
         * List of push down operations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
        private java.util.List<PushDownOperation> pushDownOperations;

        /**
         * List of push down operations.
         * @param pushDownOperations the value to set
         * @return this builder
         **/
        public Builder pushDownOperations(java.util.List<PushDownOperation> pushDownOperations) {
            this.pushDownOperations = pushDownOperations;
            this.__explicitlySet__.add("pushDownOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CallOperationConfig build() {
            CallOperationConfig __instance__ =
                    new CallOperationConfig(inFields, outFields, callAttribute, pushDownOperations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CallOperationConfig o) {
            Builder copiedBuilder =
                    inFields(o.getInFields())
                            .outFields(o.getOutFields())
                            .callAttribute(o.getCallAttribute())
                            .pushDownOperations(o.getPushDownOperations());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * List of names of IN/INOUT parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inFields")
    private final java.util.List<String> inFields;

    /**
     * List of names of IN/INOUT parameters.
     * @return the value
     **/
    public java.util.List<String> getInFields() {
        return inFields;
    }

    /**
     * List of names of OUT/INOUT parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outFields")
    private final java.util.List<String> outFields;

    /**
     * List of names of OUT/INOUT parameters.
     * @return the value
     **/
    public java.util.List<String> getOutFields() {
        return outFields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
    private final AbstractCallAttribute callAttribute;

    public AbstractCallAttribute getCallAttribute() {
        return callAttribute;
    }

    /**
     * List of push down operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
    private final java.util.List<PushDownOperation> pushDownOperations;

    /**
     * List of push down operations.
     * @return the value
     **/
    public java.util.List<PushDownOperation> getPushDownOperations() {
        return pushDownOperations;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CallOperationConfig(");
        sb.append("inFields=").append(String.valueOf(this.inFields));
        sb.append(", outFields=").append(String.valueOf(this.outFields));
        sb.append(", callAttribute=").append(String.valueOf(this.callAttribute));
        sb.append(", pushDownOperations=").append(String.valueOf(this.pushDownOperations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CallOperationConfig)) {
            return false;
        }

        CallOperationConfig other = (CallOperationConfig) o;
        return java.util.Objects.equals(this.inFields, other.inFields)
                && java.util.Objects.equals(this.outFields, other.outFields)
                && java.util.Objects.equals(this.callAttribute, other.callAttribute)
                && java.util.Objects.equals(this.pushDownOperations, other.pushDownOperations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inFields == null ? 43 : this.inFields.hashCode());
        result = (result * PRIME) + (this.outFields == null ? 43 : this.outFields.hashCode());
        result =
                (result * PRIME)
                        + (this.callAttribute == null ? 43 : this.callAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.pushDownOperations == null
                                ? 43
                                : this.pushDownOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
