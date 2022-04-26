/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details about Security Zone Target.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityZoneTargetDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetResourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecurityZoneTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("securityZoneId")
        private String securityZoneId;

        public Builder securityZoneId(String securityZoneId) {
            this.securityZoneId = securityZoneId;
            this.__explicitlySet__.add("securityZoneId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityZoneDisplayName")
        private String securityZoneDisplayName;

        public Builder securityZoneDisplayName(String securityZoneDisplayName) {
            this.securityZoneDisplayName = securityZoneDisplayName;
            this.__explicitlySet__.add("securityZoneDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSecurityZoneRecipes")
        private java.util.List<SecurityRecipe> targetSecurityZoneRecipes;

        public Builder targetSecurityZoneRecipes(
                java.util.List<SecurityRecipe> targetSecurityZoneRecipes) {
            this.targetSecurityZoneRecipes = targetSecurityZoneRecipes;
            this.__explicitlySet__.add("targetSecurityZoneRecipes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityZoneTargetDetails build() {
            SecurityZoneTargetDetails __instance__ =
                    new SecurityZoneTargetDetails(
                            securityZoneId, securityZoneDisplayName, targetSecurityZoneRecipes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityZoneTargetDetails o) {
            Builder copiedBuilder =
                    securityZoneId(o.getSecurityZoneId())
                            .securityZoneDisplayName(o.getSecurityZoneDisplayName())
                            .targetSecurityZoneRecipes(o.getTargetSecurityZoneRecipes());

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

    @Deprecated
    public SecurityZoneTargetDetails(
            String securityZoneId,
            String securityZoneDisplayName,
            java.util.List<SecurityRecipe> targetSecurityZoneRecipes) {
        super();
        this.securityZoneId = securityZoneId;
        this.securityZoneDisplayName = securityZoneDisplayName;
        this.targetSecurityZoneRecipes = targetSecurityZoneRecipes;
    }

    /**
     * The OCID of the security zone to associate this compartment with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityZoneId")
    String securityZoneId;

    /**
     * The name of the security zone to associate this compartment with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityZoneDisplayName")
    String securityZoneDisplayName;

    /**
     * The list of security zone recipes to associate this compartment with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetSecurityZoneRecipes")
    java.util.List<SecurityRecipe> targetSecurityZoneRecipes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
