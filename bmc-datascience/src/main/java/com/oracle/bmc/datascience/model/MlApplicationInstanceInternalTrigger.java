/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Trigger details <br>
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
        builder = MlApplicationInstanceInternalTrigger.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MlApplicationInstanceInternalTrigger extends InstanceComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /** Trigger definition for given ML Application Instance */
        @com.fasterxml.jackson.annotation.JsonProperty("triggerDefinition")
        private String triggerDefinition;

        /**
         * Trigger definition for given ML Application Instance
         *
         * @param triggerDefinition the value to set
         * @return this builder
         */
        public Builder triggerDefinition(String triggerDefinition) {
            this.triggerDefinition = triggerDefinition;
            this.__explicitlySet__.add("triggerDefinition");
            return this;
        }
        /**
         * Indicates whether the trigger is enabled. If it is false trigger does not fire even when
         * the trigger condition is met.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether the trigger is enabled. If it is false trigger does not fire even when
         * the trigger condition is met.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MlApplicationInstanceInternalTrigger build() {
            MlApplicationInstanceInternalTrigger model =
                    new MlApplicationInstanceInternalTrigger(
                            this.name, this.componentName, this.triggerDefinition, this.isEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MlApplicationInstanceInternalTrigger model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("triggerDefinition")) {
                this.triggerDefinition(model.getTriggerDefinition());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
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
    public MlApplicationInstanceInternalTrigger(
            String name, String componentName, String triggerDefinition, Boolean isEnabled) {
        super(name, componentName);
        this.triggerDefinition = triggerDefinition;
        this.isEnabled = isEnabled;
    }

    /** Trigger definition for given ML Application Instance */
    @com.fasterxml.jackson.annotation.JsonProperty("triggerDefinition")
    private final String triggerDefinition;

    /**
     * Trigger definition for given ML Application Instance
     *
     * @return the value
     */
    public String getTriggerDefinition() {
        return triggerDefinition;
    }

    /**
     * Indicates whether the trigger is enabled. If it is false trigger does not fire even when the
     * trigger condition is met.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether the trigger is enabled. If it is false trigger does not fire even when the
     * trigger condition is met.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("MlApplicationInstanceInternalTrigger(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", triggerDefinition=").append(String.valueOf(this.triggerDefinition));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MlApplicationInstanceInternalTrigger)) {
            return false;
        }

        MlApplicationInstanceInternalTrigger other = (MlApplicationInstanceInternalTrigger) o;
        return java.util.Objects.equals(this.triggerDefinition, other.triggerDefinition)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.triggerDefinition == null ? 43 : this.triggerDefinition.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        return result;
    }
}
