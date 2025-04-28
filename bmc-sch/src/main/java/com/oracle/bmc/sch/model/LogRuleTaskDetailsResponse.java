/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The log filter task. For configuration instructions, see [Creating a
 * Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogRuleTaskDetailsResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogRuleTaskDetailsResponse extends TaskDetailsResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointMetadata")
        private PrivateEndpointMetadata privateEndpointMetadata;

        public Builder privateEndpointMetadata(PrivateEndpointMetadata privateEndpointMetadata) {
            this.privateEndpointMetadata = privateEndpointMetadata;
            this.__explicitlySet__.add("privateEndpointMetadata");
            return this;
        }
        /** A filter or mask to limit the source used in the flow defined by the connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * A filter or mask to limit the source used in the flow defined by the connector.
         *
         * @param condition the value to set
         * @return this builder
         */
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogRuleTaskDetailsResponse build() {
            LogRuleTaskDetailsResponse model =
                    new LogRuleTaskDetailsResponse(this.privateEndpointMetadata, this.condition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogRuleTaskDetailsResponse model) {
            if (model.wasPropertyExplicitlySet("privateEndpointMetadata")) {
                this.privateEndpointMetadata(model.getPrivateEndpointMetadata());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
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

    @Deprecated
    public LogRuleTaskDetailsResponse(
            PrivateEndpointMetadata privateEndpointMetadata, String condition) {
        super(privateEndpointMetadata);
        this.condition = condition;
    }

    /** A filter or mask to limit the source used in the flow defined by the connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * A filter or mask to limit the source used in the flow defined by the connector.
     *
     * @return the value
     */
    public String getCondition() {
        return condition;
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
        sb.append("LogRuleTaskDetailsResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogRuleTaskDetailsResponse)) {
            return false;
        }

        LogRuleTaskDetailsResponse other = (LogRuleTaskDetailsResponse) o;
        return java.util.Objects.equals(this.condition, other.condition) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        return result;
    }
}
