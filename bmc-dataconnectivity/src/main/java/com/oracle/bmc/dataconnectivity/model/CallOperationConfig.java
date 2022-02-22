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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CallOperationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CallOperationConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("inFields")
        private java.util.List<String> inFields;

        public Builder inFields(java.util.List<String> inFields) {
            this.inFields = inFields;
            this.__explicitlySet__.add("inFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outFields")
        private java.util.List<String> outFields;

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

        @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
        private java.util.List<PushDownOperation> pushDownOperations;

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

    /**
     * List of names of IN/INOUT parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inFields")
    java.util.List<String> inFields;

    /**
     * List of names of OUT/INOUT parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outFields")
    java.util.List<String> outFields;

    @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
    AbstractCallAttribute callAttribute;

    /**
     * List of push down operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pushDownOperations")
    java.util.List<PushDownOperation> pushDownOperations;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
