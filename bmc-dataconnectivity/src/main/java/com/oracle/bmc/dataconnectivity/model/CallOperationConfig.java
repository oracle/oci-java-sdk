/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Holder for parameter names. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CallOperationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CallOperationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The list of names of the IN/INOUT parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("inFields")
        private java.util.List<String> inFields;

        /**
         * The list of names of the IN/INOUT parameters.
         *
         * @param inFields the value to set
         * @return this builder
         */
        public Builder inFields(java.util.List<String> inFields) {
            this.inFields = inFields;
            this.__explicitlySet__.add("inFields");
            return this;
        }
        /** The list of names of the OUT/INOUT parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("outFields")
        private java.util.List<String> outFields;

        /**
         * The list of names of the OUT/INOUT parameters.
         *
         * @param outFields the value to set
         * @return this builder
         */
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
        /** The List of push down operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
        private java.util.List<PushDownOperation> pushDownOperations;

        /**
         * The List of push down operations.
         *
         * @param pushDownOperations the value to set
         * @return this builder
         */
        public Builder pushDownOperations(java.util.List<PushDownOperation> pushDownOperations) {
            this.pushDownOperations = pushDownOperations;
            this.__explicitlySet__.add("pushDownOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CallOperationConfig build() {
            CallOperationConfig model =
                    new CallOperationConfig(
                            this.inFields,
                            this.outFields,
                            this.callAttribute,
                            this.pushDownOperations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CallOperationConfig model) {
            if (model.wasPropertyExplicitlySet("inFields")) {
                this.inFields(model.getInFields());
            }
            if (model.wasPropertyExplicitlySet("outFields")) {
                this.outFields(model.getOutFields());
            }
            if (model.wasPropertyExplicitlySet("callAttribute")) {
                this.callAttribute(model.getCallAttribute());
            }
            if (model.wasPropertyExplicitlySet("pushDownOperations")) {
                this.pushDownOperations(model.getPushDownOperations());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The list of names of the IN/INOUT parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("inFields")
    private final java.util.List<String> inFields;

    /**
     * The list of names of the IN/INOUT parameters.
     *
     * @return the value
     */
    public java.util.List<String> getInFields() {
        return inFields;
    }

    /** The list of names of the OUT/INOUT parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("outFields")
    private final java.util.List<String> outFields;

    /**
     * The list of names of the OUT/INOUT parameters.
     *
     * @return the value
     */
    public java.util.List<String> getOutFields() {
        return outFields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
    private final AbstractCallAttribute callAttribute;

    public AbstractCallAttribute getCallAttribute() {
        return callAttribute;
    }

    /** The List of push down operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
    private final java.util.List<PushDownOperation> pushDownOperations;

    /**
     * The List of push down operations.
     *
     * @return the value
     */
    public java.util.List<PushDownOperation> getPushDownOperations() {
        return pushDownOperations;
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
        sb.append("CallOperationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("inFields=").append(String.valueOf(this.inFields));
        sb.append(", outFields=").append(String.valueOf(this.outFields));
        sb.append(", callAttribute=").append(String.valueOf(this.callAttribute));
        sb.append(", pushDownOperations=").append(String.valueOf(this.pushDownOperations));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
