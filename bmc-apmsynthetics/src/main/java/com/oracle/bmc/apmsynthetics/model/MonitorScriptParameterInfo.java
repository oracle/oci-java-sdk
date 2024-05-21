/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the script parameters in the monitor.
 * isOverwritten specifies that the script parameters are overwritten in the monitor.
 * If the user overwrites the parameter value in the monitor, then the overwritten values will be used to run the monitor.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitorScriptParameterInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitorScriptParameterInfo
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"monitorScriptParameter", "isSecret", "isOverwritten"})
    public MonitorScriptParameterInfo(
            MonitorScriptParameter monitorScriptParameter,
            Boolean isSecret,
            Boolean isOverwritten) {
        super();
        this.monitorScriptParameter = monitorScriptParameter;
        this.isSecret = isSecret;
        this.isOverwritten = isOverwritten;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("monitorScriptParameter")
        private MonitorScriptParameter monitorScriptParameter;

        public Builder monitorScriptParameter(MonitorScriptParameter monitorScriptParameter) {
            this.monitorScriptParameter = monitorScriptParameter;
            this.__explicitlySet__.add("monitorScriptParameter");
            return this;
        }
        /**
         * Describes if  the parameter value is secret and should be kept confidential.
         * isSecret is specified in either CreateScript or UpdateScript API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
        private Boolean isSecret;

        /**
         * Describes if  the parameter value is secret and should be kept confidential.
         * isSecret is specified in either CreateScript or UpdateScript API.
         *
         * @param isSecret the value to set
         * @return this builder
         **/
        public Builder isSecret(Boolean isSecret) {
            this.isSecret = isSecret;
            this.__explicitlySet__.add("isSecret");
            return this;
        }
        /**
         * If parameter value is default or overwritten.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
        private Boolean isOverwritten;

        /**
         * If parameter value is default or overwritten.
         *
         * @param isOverwritten the value to set
         * @return this builder
         **/
        public Builder isOverwritten(Boolean isOverwritten) {
            this.isOverwritten = isOverwritten;
            this.__explicitlySet__.add("isOverwritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorScriptParameterInfo build() {
            MonitorScriptParameterInfo model =
                    new MonitorScriptParameterInfo(
                            this.monitorScriptParameter, this.isSecret, this.isOverwritten);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorScriptParameterInfo model) {
            if (model.wasPropertyExplicitlySet("monitorScriptParameter")) {
                this.monitorScriptParameter(model.getMonitorScriptParameter());
            }
            if (model.wasPropertyExplicitlySet("isSecret")) {
                this.isSecret(model.getIsSecret());
            }
            if (model.wasPropertyExplicitlySet("isOverwritten")) {
                this.isOverwritten(model.getIsOverwritten());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("monitorScriptParameter")
    private final MonitorScriptParameter monitorScriptParameter;

    public MonitorScriptParameter getMonitorScriptParameter() {
        return monitorScriptParameter;
    }

    /**
     * Describes if  the parameter value is secret and should be kept confidential.
     * isSecret is specified in either CreateScript or UpdateScript API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
    private final Boolean isSecret;

    /**
     * Describes if  the parameter value is secret and should be kept confidential.
     * isSecret is specified in either CreateScript or UpdateScript API.
     *
     * @return the value
     **/
    public Boolean getIsSecret() {
        return isSecret;
    }

    /**
     * If parameter value is default or overwritten.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
    private final Boolean isOverwritten;

    /**
     * If parameter value is default or overwritten.
     *
     * @return the value
     **/
    public Boolean getIsOverwritten() {
        return isOverwritten;
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
        sb.append("MonitorScriptParameterInfo(");
        sb.append("super=").append(super.toString());
        sb.append("monitorScriptParameter=").append(String.valueOf(this.monitorScriptParameter));
        sb.append(", isSecret=").append(String.valueOf(this.isSecret));
        sb.append(", isOverwritten=").append(String.valueOf(this.isOverwritten));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorScriptParameterInfo)) {
            return false;
        }

        MonitorScriptParameterInfo other = (MonitorScriptParameterInfo) o;
        return java.util.Objects.equals(this.monitorScriptParameter, other.monitorScriptParameter)
                && java.util.Objects.equals(this.isSecret, other.isSecret)
                && java.util.Objects.equals(this.isOverwritten, other.isOverwritten)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.monitorScriptParameter == null
                                ? 43
                                : this.monitorScriptParameter.hashCode());
        result = (result * PRIME) + (this.isSecret == null ? 43 : this.isSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverwritten == null ? 43 : this.isOverwritten.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
