/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the OLVM target asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOlvmTargetAssetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOlvmTargetAssetDetails extends CreateTargetAssetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanId")
        private String migrationPlanId;

        public Builder migrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            this.__explicitlySet__.add("migrationPlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
        private Boolean isExcludedFromExecution;

        public Builder isExcludedFromExecution(Boolean isExcludedFromExecution) {
            this.isExcludedFromExecution = isExcludedFromExecution;
            this.__explicitlySet__.add("isExcludedFromExecution");
            return this;
        }
        /**
         * Microsoft license for the VM configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
        private String msLicense;

        /**
         * Microsoft license for the VM configuration.
         * @param msLicense the value to set
         * @return this builder
         **/
        public Builder msLicense(String msLicense) {
            this.msLicense = msLicense;
            this.__explicitlySet__.add("msLicense");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOlvmTargetAssetDetails build() {
            CreateOlvmTargetAssetDetails model =
                    new CreateOlvmTargetAssetDetails(
                            this.migrationPlanId, this.isExcludedFromExecution, this.msLicense);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOlvmTargetAssetDetails model) {
            if (model.wasPropertyExplicitlySet("migrationPlanId")) {
                this.migrationPlanId(model.getMigrationPlanId());
            }
            if (model.wasPropertyExplicitlySet("isExcludedFromExecution")) {
                this.isExcludedFromExecution(model.getIsExcludedFromExecution());
            }
            if (model.wasPropertyExplicitlySet("msLicense")) {
                this.msLicense(model.getMsLicense());
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

    @Deprecated
    public CreateOlvmTargetAssetDetails(
            String migrationPlanId, Boolean isExcludedFromExecution, String msLicense) {
        super(migrationPlanId, isExcludedFromExecution);
        this.msLicense = msLicense;
    }

    /**
     * Microsoft license for the VM configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
    private final String msLicense;

    /**
     * Microsoft license for the VM configuration.
     * @return the value
     **/
    public String getMsLicense() {
        return msLicense;
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
        sb.append("CreateOlvmTargetAssetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", msLicense=").append(String.valueOf(this.msLicense));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOlvmTargetAssetDetails)) {
            return false;
        }

        CreateOlvmTargetAssetDetails other = (CreateOlvmTargetAssetDetails) o;
        return java.util.Objects.equals(this.msLicense, other.msLicense) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.msLicense == null ? 43 : this.msLicense.hashCode());
        return result;
    }
}
