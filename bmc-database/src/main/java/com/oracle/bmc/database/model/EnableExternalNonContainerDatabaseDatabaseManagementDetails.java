/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to enable Database Management on an external non-container database.
 *
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
    builder = EnableExternalNonContainerDatabaseDatabaseManagementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EnableExternalNonContainerDatabaseDatabaseManagementDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"licenseModel", "externalDatabaseConnectorId"})
    public EnableExternalNonContainerDatabaseDatabaseManagementDetails(
            LicenseModel licenseModel, String externalDatabaseConnectorId) {
        super();
        this.licenseModel = licenseModel;
        this.externalDatabaseConnectorId = externalDatabaseConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle license model that applies to the external database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the external database.
         *
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseConnectorId")
        private String externalDatabaseConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         * @param externalDatabaseConnectorId the value to set
         * @return this builder
         **/
        public Builder externalDatabaseConnectorId(String externalDatabaseConnectorId) {
            this.externalDatabaseConnectorId = externalDatabaseConnectorId;
            this.__explicitlySet__.add("externalDatabaseConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableExternalNonContainerDatabaseDatabaseManagementDetails build() {
            EnableExternalNonContainerDatabaseDatabaseManagementDetails __instance__ =
                    new EnableExternalNonContainerDatabaseDatabaseManagementDetails(
                            licenseModel, externalDatabaseConnectorId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableExternalNonContainerDatabaseDatabaseManagementDetails o) {
            Builder copiedBuilder =
                    licenseModel(o.getLicenseModel())
                            .externalDatabaseConnectorId(o.getExternalDatabaseConnectorId());

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
     * The Oracle license model that applies to the external database.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to the external database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the external database.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseConnectorId")
    private final String externalDatabaseConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     **/
    public String getExternalDatabaseConnectorId() {
        return externalDatabaseConnectorId;
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
        sb.append("EnableExternalNonContainerDatabaseDatabaseManagementDetails(");
        sb.append("licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", externalDatabaseConnectorId=")
                .append(String.valueOf(this.externalDatabaseConnectorId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalNonContainerDatabaseDatabaseManagementDetails)) {
            return false;
        }

        EnableExternalNonContainerDatabaseDatabaseManagementDetails other =
                (EnableExternalNonContainerDatabaseDatabaseManagementDetails) o;
        return java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.externalDatabaseConnectorId, other.externalDatabaseConnectorId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatabaseConnectorId == null
                                ? 43
                                : this.externalDatabaseConnectorId.hashCode());
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
