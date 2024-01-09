/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create the external Exadata infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateExternalExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExternalExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "discoveryKey",
        "licenseModel",
        "compartmentId",
        "displayName",
        "dbSystemIds",
        "storageServerNames"
    })
    public CreateExternalExadataInfrastructureDetails(
            String discoveryKey,
            LicenseModel licenseModel,
            String compartmentId,
            String displayName,
            java.util.List<String> dbSystemIds,
            java.util.List<String> storageServerNames) {
        super();
        this.discoveryKey = discoveryKey;
        this.licenseModel = licenseModel;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbSystemIds = dbSystemIds;
        this.storageServerNames = storageServerNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key of the discovery request. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryKey")
        private String discoveryKey;

        /**
         * The unique key of the discovery request.
         *
         * @param discoveryKey the value to set
         * @return this builder
         */
        public Builder discoveryKey(String discoveryKey) {
            this.discoveryKey = discoveryKey;
            this.__explicitlySet__.add("discoveryKey");
            return this;
        }
        /** The Oracle license model that applies to the database management resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the database management resources.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the Exadata infrastructure.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The list of DB systems in the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemIds")
        private java.util.List<String> dbSystemIds;

        /**
         * The list of DB systems in the Exadata infrastructure.
         *
         * @param dbSystemIds the value to set
         * @return this builder
         */
        public Builder dbSystemIds(java.util.List<String> dbSystemIds) {
            this.dbSystemIds = dbSystemIds;
            this.__explicitlySet__.add("dbSystemIds");
            return this;
        }
        /**
         * The list of all the Exadata storage server names to be included for monitoring purposes.
         * If not specified, all the Exadata storage servers associated with the DB systems are
         * included.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerNames")
        private java.util.List<String> storageServerNames;

        /**
         * The list of all the Exadata storage server names to be included for monitoring purposes.
         * If not specified, all the Exadata storage servers associated with the DB systems are
         * included.
         *
         * @param storageServerNames the value to set
         * @return this builder
         */
        public Builder storageServerNames(java.util.List<String> storageServerNames) {
            this.storageServerNames = storageServerNames;
            this.__explicitlySet__.add("storageServerNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalExadataInfrastructureDetails build() {
            CreateExternalExadataInfrastructureDetails model =
                    new CreateExternalExadataInfrastructureDetails(
                            this.discoveryKey,
                            this.licenseModel,
                            this.compartmentId,
                            this.displayName,
                            this.dbSystemIds,
                            this.storageServerNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("discoveryKey")) {
                this.discoveryKey(model.getDiscoveryKey());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbSystemIds")) {
                this.dbSystemIds(model.getDbSystemIds());
            }
            if (model.wasPropertyExplicitlySet("storageServerNames")) {
                this.storageServerNames(model.getStorageServerNames());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The unique key of the discovery request. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryKey")
    private final String discoveryKey;

    /**
     * The unique key of the discovery request.
     *
     * @return the value
     */
    public String getDiscoveryKey() {
        return discoveryKey;
    }

    /** The Oracle license model that applies to the database management resources. */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The Oracle license model that applies to the database management resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the database management resources.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the Exadata infrastructure.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The list of DB systems in the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemIds")
    private final java.util.List<String> dbSystemIds;

    /**
     * The list of DB systems in the Exadata infrastructure.
     *
     * @return the value
     */
    public java.util.List<String> getDbSystemIds() {
        return dbSystemIds;
    }

    /**
     * The list of all the Exadata storage server names to be included for monitoring purposes. If
     * not specified, all the Exadata storage servers associated with the DB systems are included.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerNames")
    private final java.util.List<String> storageServerNames;

    /**
     * The list of all the Exadata storage server names to be included for monitoring purposes. If
     * not specified, all the Exadata storage servers associated with the DB systems are included.
     *
     * @return the value
     */
    public java.util.List<String> getStorageServerNames() {
        return storageServerNames;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateExternalExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("discoveryKey=").append(String.valueOf(this.discoveryKey));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbSystemIds=").append(String.valueOf(this.dbSystemIds));
        sb.append(", storageServerNames=").append(String.valueOf(this.storageServerNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalExadataInfrastructureDetails)) {
            return false;
        }

        CreateExternalExadataInfrastructureDetails other =
                (CreateExternalExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.discoveryKey, other.discoveryKey)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbSystemIds, other.dbSystemIds)
                && java.util.Objects.equals(this.storageServerNames, other.storageServerNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.discoveryKey == null ? 43 : this.discoveryKey.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dbSystemIds == null ? 43 : this.dbSystemIds.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerNames == null
                                ? 43
                                : this.storageServerNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
