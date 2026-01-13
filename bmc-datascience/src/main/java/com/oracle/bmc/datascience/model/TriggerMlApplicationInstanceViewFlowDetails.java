/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Payload for trigger request endpoint <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TriggerMlApplicationInstanceViewFlowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TriggerMlApplicationInstanceViewFlowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"triggerName", "parameters"})
    public TriggerMlApplicationInstanceViewFlowDetails(
            String triggerName, java.util.List<TriggerParameter> parameters) {
        super();
        this.triggerName = triggerName;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of trigger */
        @com.fasterxml.jackson.annotation.JsonProperty("triggerName")
        private String triggerName;

        /**
         * Name of trigger
         *
         * @param triggerName the value to set
         * @return this builder
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            this.__explicitlySet__.add("triggerName");
            return this;
        }
        /** Parameters provided for given trigger invocation (they must match predefined schema) */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<TriggerParameter> parameters;

        /**
         * Parameters provided for given trigger invocation (they must match predefined schema)
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<TriggerParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerMlApplicationInstanceViewFlowDetails build() {
            TriggerMlApplicationInstanceViewFlowDetails model =
                    new TriggerMlApplicationInstanceViewFlowDetails(
                            this.triggerName, this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerMlApplicationInstanceViewFlowDetails model) {
            if (model.wasPropertyExplicitlySet("triggerName")) {
                this.triggerName(model.getTriggerName());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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

    /** Name of trigger */
    @com.fasterxml.jackson.annotation.JsonProperty("triggerName")
    private final String triggerName;

    /**
     * Name of trigger
     *
     * @return the value
     */
    public String getTriggerName() {
        return triggerName;
    }

    /** Parameters provided for given trigger invocation (they must match predefined schema) */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<TriggerParameter> parameters;

    /**
     * Parameters provided for given trigger invocation (they must match predefined schema)
     *
     * @return the value
     */
    public java.util.List<TriggerParameter> getParameters() {
        return parameters;
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
        sb.append("TriggerMlApplicationInstanceViewFlowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("triggerName=").append(String.valueOf(this.triggerName));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TriggerMlApplicationInstanceViewFlowDetails)) {
            return false;
        }

        TriggerMlApplicationInstanceViewFlowDetails other =
                (TriggerMlApplicationInstanceViewFlowDetails) o;
        return java.util.Objects.equals(this.triggerName, other.triggerName)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.triggerName == null ? 43 : this.triggerName.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
