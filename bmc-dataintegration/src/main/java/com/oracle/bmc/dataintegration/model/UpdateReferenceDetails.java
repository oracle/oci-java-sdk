/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Application references that need to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateReferenceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateReferenceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.Map<String, String> options;

        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
        private Object targetObject;

        public Builder targetObject(Object targetObject) {
            this.targetObject = targetObject;
            this.__explicitlySet__.add("targetObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
        private java.util.List<ChildReferenceDetail> childReferences;

        public Builder childReferences(java.util.List<ChildReferenceDetail> childReferences) {
            this.childReferences = childReferences;
            this.__explicitlySet__.add("childReferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateReferenceDetails build() {
            UpdateReferenceDetails __instance__ =
                    new UpdateReferenceDetails(options, targetObject, childReferences);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateReferenceDetails o) {
            Builder copiedBuilder =
                    options(o.getOptions())
                            .targetObject(o.getTargetObject())
                            .childReferences(o.getChildReferences());

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
     * A list of options such as `ignoreObjectOnError`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    java.util.Map<String, String> options;

    /**
     * The new target object to reference. This should be of type `DataAsset`. The child references can be of type `Connection`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
    Object targetObject;

    /**
     * The list of child references that also need to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
    java.util.List<ChildReferenceDetail> childReferences;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
