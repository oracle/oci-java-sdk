/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitorScriptParameterInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitorScriptParameterInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("monitorScriptParameter")
        private MonitorScriptParameter monitorScriptParameter;

        public Builder monitorScriptParameter(MonitorScriptParameter monitorScriptParameter) {
            this.monitorScriptParameter = monitorScriptParameter;
            this.__explicitlySet__.add("monitorScriptParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
        private Boolean isSecret;

        public Builder isSecret(Boolean isSecret) {
            this.isSecret = isSecret;
            this.__explicitlySet__.add("isSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
        private Boolean isOverwritten;

        public Builder isOverwritten(Boolean isOverwritten) {
            this.isOverwritten = isOverwritten;
            this.__explicitlySet__.add("isOverwritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorScriptParameterInfo build() {
            MonitorScriptParameterInfo __instance__ =
                    new MonitorScriptParameterInfo(monitorScriptParameter, isSecret, isOverwritten);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorScriptParameterInfo o) {
            Builder copiedBuilder =
                    monitorScriptParameter(o.getMonitorScriptParameter())
                            .isSecret(o.getIsSecret())
                            .isOverwritten(o.getIsOverwritten());

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

    @com.fasterxml.jackson.annotation.JsonProperty("monitorScriptParameter")
    MonitorScriptParameter monitorScriptParameter;

    /**
     * Describes if  the parameter value is secret and should be kept confidential.
     * isSecret is specified in either CreateScript or UpdateScript API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecret")
    Boolean isSecret;

    /**
     * If parameter value is default or overwritten.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
    Boolean isOverwritten;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
