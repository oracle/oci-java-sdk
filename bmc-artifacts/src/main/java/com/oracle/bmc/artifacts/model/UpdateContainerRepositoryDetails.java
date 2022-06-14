/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Update container repository request details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateContainerRepositoryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateContainerRepositoryDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isImmutable", "isPublic", "readme"})
    public UpdateContainerRepositoryDetails(
            Boolean isImmutable, Boolean isPublic, ContainerRepositoryReadme readme) {
        super();
        this.isImmutable = isImmutable;
        this.isPublic = isPublic;
        this.readme = readme;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
        private Boolean isImmutable;

        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
         * @param isImmutable the value to set
         * @return this builder
         **/
        public Builder isImmutable(Boolean isImmutable) {
            this.isImmutable = isImmutable;
            this.__explicitlySet__.add("isImmutable");
            return this;
        }
        /**
         * Whether the repository is public. A public repository allows unauthenticated access.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the repository is public. A public repository allows unauthenticated access.
         * @param isPublic the value to set
         * @return this builder
         **/
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readme")
        private ContainerRepositoryReadme readme;

        public Builder readme(ContainerRepositoryReadme readme) {
            this.readme = readme;
            this.__explicitlySet__.add("readme");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateContainerRepositoryDetails build() {
            UpdateContainerRepositoryDetails __instance__ =
                    new UpdateContainerRepositoryDetails(isImmutable, isPublic, readme);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateContainerRepositoryDetails o) {
            Builder copiedBuilder =
                    isImmutable(o.getIsImmutable()).isPublic(o.getIsPublic()).readme(o.getReadme());

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
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
    private final Boolean isImmutable;

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     * @return the value
     **/
    public Boolean getIsImmutable() {
        return isImmutable;
    }

    /**
     * Whether the repository is public. A public repository allows unauthenticated access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the repository is public. A public repository allows unauthenticated access.
     * @return the value
     **/
    public Boolean getIsPublic() {
        return isPublic;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readme")
    private final ContainerRepositoryReadme readme;

    public ContainerRepositoryReadme getReadme() {
        return readme;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateContainerRepositoryDetails(");
        sb.append("isImmutable=").append(String.valueOf(this.isImmutable));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", readme=").append(String.valueOf(this.readme));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateContainerRepositoryDetails)) {
            return false;
        }

        UpdateContainerRepositoryDetails other = (UpdateContainerRepositoryDetails) o;
        return java.util.Objects.equals(this.isImmutable, other.isImmutable)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.readme, other.readme)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isImmutable == null ? 43 : this.isImmutable.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.readme == null ? 43 : this.readme.hashCode());
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
