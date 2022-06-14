/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional Pre-Migration advisor settings.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAdvisorSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAdvisorSettings {
    @Deprecated
    @java.beans.ConstructorProperties({"isSkipAdvisor", "isIgnoreErrors"})
    public CreateAdvisorSettings(Boolean isSkipAdvisor, Boolean isIgnoreErrors) {
        super();
        this.isSkipAdvisor = isSkipAdvisor;
        this.isIgnoreErrors = isIgnoreErrors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * True to skip the Pre-Migration Advisor execution. Default is false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipAdvisor")
        private Boolean isSkipAdvisor;

        /**
         * True to skip the Pre-Migration Advisor execution. Default is false.
         *
         * @param isSkipAdvisor the value to set
         * @return this builder
         **/
        public Builder isSkipAdvisor(Boolean isSkipAdvisor) {
            this.isSkipAdvisor = isSkipAdvisor;
            this.__explicitlySet__.add("isSkipAdvisor");
            return this;
        }
        /**
         * True to not interrupt migration execution due to Pre-Migration Advisor errors. Default is false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrors")
        private Boolean isIgnoreErrors;

        /**
         * True to not interrupt migration execution due to Pre-Migration Advisor errors. Default is false.
         *
         * @param isIgnoreErrors the value to set
         * @return this builder
         **/
        public Builder isIgnoreErrors(Boolean isIgnoreErrors) {
            this.isIgnoreErrors = isIgnoreErrors;
            this.__explicitlySet__.add("isIgnoreErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAdvisorSettings build() {
            CreateAdvisorSettings __instance__ =
                    new CreateAdvisorSettings(isSkipAdvisor, isIgnoreErrors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAdvisorSettings o) {
            Builder copiedBuilder =
                    isSkipAdvisor(o.getIsSkipAdvisor()).isIgnoreErrors(o.getIsIgnoreErrors());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * True to skip the Pre-Migration Advisor execution. Default is false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipAdvisor")
    private final Boolean isSkipAdvisor;

    /**
     * True to skip the Pre-Migration Advisor execution. Default is false.
     *
     * @return the value
     **/
    public Boolean getIsSkipAdvisor() {
        return isSkipAdvisor;
    }

    /**
     * True to not interrupt migration execution due to Pre-Migration Advisor errors. Default is false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreErrors")
    private final Boolean isIgnoreErrors;

    /**
     * True to not interrupt migration execution due to Pre-Migration Advisor errors. Default is false.
     *
     * @return the value
     **/
    public Boolean getIsIgnoreErrors() {
        return isIgnoreErrors;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAdvisorSettings(");
        sb.append("isSkipAdvisor=").append(String.valueOf(this.isSkipAdvisor));
        sb.append(", isIgnoreErrors=").append(String.valueOf(this.isIgnoreErrors));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAdvisorSettings)) {
            return false;
        }

        CreateAdvisorSettings other = (CreateAdvisorSettings) o;
        return java.util.Objects.equals(this.isSkipAdvisor, other.isSkipAdvisor)
                && java.util.Objects.equals(this.isIgnoreErrors, other.isIgnoreErrors)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isSkipAdvisor == null ? 43 : this.isSkipAdvisor.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreErrors == null ? 43 : this.isIgnoreErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
