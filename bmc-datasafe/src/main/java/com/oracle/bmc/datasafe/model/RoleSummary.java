/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of a role fetched from the database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RoleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("roleName")
        private String roleName;

        public Builder roleName(String roleName) {
            this.roleName = roleName;
            this.__explicitlySet__.add("roleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private String authenticationType;

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPasswordRequired")
        private Boolean isPasswordRequired;

        public Builder isPasswordRequired(Boolean isPasswordRequired) {
            this.isPasswordRequired = isPasswordRequired;
            this.__explicitlySet__.add("isPasswordRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCommon")
        private Boolean isCommon;

        public Builder isCommon(Boolean isCommon) {
            this.isCommon = isCommon;
            this.__explicitlySet__.add("isCommon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
        private Boolean isOracleMaintained;

        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = isOracleMaintained;
            this.__explicitlySet__.add("isOracleMaintained");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
        private Boolean isInherited;

        public Builder isInherited(Boolean isInherited) {
            this.isInherited = isInherited;
            this.__explicitlySet__.add("isInherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
        private Boolean isImplicit;

        public Builder isImplicit(Boolean isImplicit) {
            this.isImplicit = isImplicit;
            this.__explicitlySet__.add("isImplicit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoleSummary build() {
            RoleSummary __instance__ =
                    new RoleSummary(
                            roleName,
                            authenticationType,
                            isPasswordRequired,
                            isCommon,
                            isOracleMaintained,
                            isInherited,
                            isImplicit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleSummary o) {
            Builder copiedBuilder =
                    roleName(o.getRoleName())
                            .authenticationType(o.getAuthenticationType())
                            .isPasswordRequired(o.getIsPasswordRequired())
                            .isCommon(o.getIsCommon())
                            .isOracleMaintained(o.getIsOracleMaintained())
                            .isInherited(o.getIsInherited())
                            .isImplicit(o.getIsImplicit());

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
     * Name of the role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roleName")
    String roleName;

    /**
     * Type of authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    String authenticationType;

    /**
     * Is password required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPasswordRequired")
    Boolean isPasswordRequired;

    /**
     * Is the role common.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCommon")
    Boolean isCommon;

    /**
     * Is the role oracle maintained.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
    Boolean isOracleMaintained;

    /**
     * Is the role inherited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
    Boolean isInherited;

    /**
     * Is the role implicit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
    Boolean isImplicit;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
