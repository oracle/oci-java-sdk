/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Information about the backup destination associated with the Autonomous Container Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupDestinationDetailsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupDestinationDetailsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupDestinationAttachHistory",
        "spaceUtilizedInGBs",
        "timeAtWhichStorageDetailsAreUpdated",
        "type",
        "id",
        "vpcUser",
        "vpcPassword",
        "internetProxy",
        "dbrsPolicyId",
        "isRemote",
        "remoteRegion"
    })
    public BackupDestinationDetailsSummary(
            java.util.List<java.util.Date> backupDestinationAttachHistory,
            Integer spaceUtilizedInGBs,
            java.util.Date timeAtWhichStorageDetailsAreUpdated,
            Type type,
            String id,
            String vpcUser,
            String vpcPassword,
            String internetProxy,
            String dbrsPolicyId,
            Boolean isRemote,
            String remoteRegion) {
        super();
        this.backupDestinationAttachHistory = backupDestinationAttachHistory;
        this.spaceUtilizedInGBs = spaceUtilizedInGBs;
        this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
        this.type = type;
        this.id = id;
        this.vpcUser = vpcUser;
        this.vpcPassword = vpcPassword;
        this.internetProxy = internetProxy;
        this.dbrsPolicyId = dbrsPolicyId;
        this.isRemote = isRemote;
        this.remoteRegion = remoteRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamps at which this backup destination is used as the preferred destination to
         * host the Autonomous Container Database backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationAttachHistory")
        private java.util.List<java.util.Date> backupDestinationAttachHistory;

        /**
         * The timestamps at which this backup destination is used as the preferred destination to
         * host the Autonomous Container Database backups.
         *
         * @param backupDestinationAttachHistory the value to set
         * @return this builder
         */
        public Builder backupDestinationAttachHistory(
                java.util.List<java.util.Date> backupDestinationAttachHistory) {
            this.backupDestinationAttachHistory = backupDestinationAttachHistory;
            this.__explicitlySet__.add("backupDestinationAttachHistory");
            return this;
        }
        /**
         * The total space utilized (in GBs) by this Autonomous Container Database on this backup
         * destination, rounded to the nearest integer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("spaceUtilizedInGBs")
        private Integer spaceUtilizedInGBs;

        /**
         * The total space utilized (in GBs) by this Autonomous Container Database on this backup
         * destination, rounded to the nearest integer.
         *
         * @param spaceUtilizedInGBs the value to set
         * @return this builder
         */
        public Builder spaceUtilizedInGBs(Integer spaceUtilizedInGBs) {
            this.spaceUtilizedInGBs = spaceUtilizedInGBs;
            this.__explicitlySet__.add("spaceUtilizedInGBs");
            return this;
        }
        /**
         * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are
         * updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
        private java.util.Date timeAtWhichStorageDetailsAreUpdated;

        /**
         * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are
         * updated.
         *
         * @param timeAtWhichStorageDetailsAreUpdated the value to set
         * @return this builder
         */
        public Builder timeAtWhichStorageDetailsAreUpdated(
                java.util.Date timeAtWhichStorageDetailsAreUpdated) {
            this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
            this.__explicitlySet__.add("timeAtWhichStorageDetailsAreUpdated");
            return this;
        }
        /** Type of the database backup destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the database backup destination.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that
         * is used to access the Recovery Appliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpcUser")
        private String vpcUser;

        /**
         * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that
         * is used to access the Recovery Appliance.
         *
         * @param vpcUser the value to set
         * @return this builder
         */
        public Builder vpcUser(String vpcUser) {
            this.vpcUser = vpcUser;
            this.__explicitlySet__.add("vpcUser");
            return this;
        }
        /**
         * For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used
         * to access the Recovery Appliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpcPassword")
        private String vpcPassword;

        /**
         * For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used
         * to access the Recovery Appliance.
         *
         * @param vpcPassword the value to set
         * @return this builder
         */
        public Builder vpcPassword(String vpcPassword) {
            this.vpcPassword = vpcPassword;
            this.__explicitlySet__.add("vpcPassword");
            return this;
        }
        /** Proxy URL to connect to object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("internetProxy")
        private String internetProxy;

        /**
         * Proxy URL to connect to object store.
         *
         * @param internetProxy the value to set
         * @return this builder
         */
        public Builder internetProxy(String internetProxy) {
            this.internetProxy = internetProxy;
            this.__explicitlySet__.add("internetProxy");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DBRS policy used for backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbrsPolicyId")
        private String dbrsPolicyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DBRS policy used for backup.
         *
         * @param dbrsPolicyId the value to set
         * @return this builder
         */
        public Builder dbrsPolicyId(String dbrsPolicyId) {
            this.dbrsPolicyId = dbrsPolicyId;
            this.__explicitlySet__.add("dbrsPolicyId");
            return this;
        }
        /** Indicates whether the backup destination is cross-region or local region. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRemote")
        private Boolean isRemote;

        /**
         * Indicates whether the backup destination is cross-region or local region.
         *
         * @param isRemote the value to set
         * @return this builder
         */
        public Builder isRemote(Boolean isRemote) {
            this.isRemote = isRemote;
            this.__explicitlySet__.add("isRemote");
            return this;
        }
        /**
         * The name of the remote region where the remote automatic incremental backups will be
         * stored.
         *
         * <p>For information about valid region names, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteRegion")
        private String remoteRegion;

        /**
         * The name of the remote region where the remote automatic incremental backups will be
         * stored.
         *
         * <p>For information about valid region names, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
         *
         * @param remoteRegion the value to set
         * @return this builder
         */
        public Builder remoteRegion(String remoteRegion) {
            this.remoteRegion = remoteRegion;
            this.__explicitlySet__.add("remoteRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupDestinationDetailsSummary build() {
            BackupDestinationDetailsSummary model =
                    new BackupDestinationDetailsSummary(
                            this.backupDestinationAttachHistory,
                            this.spaceUtilizedInGBs,
                            this.timeAtWhichStorageDetailsAreUpdated,
                            this.type,
                            this.id,
                            this.vpcUser,
                            this.vpcPassword,
                            this.internetProxy,
                            this.dbrsPolicyId,
                            this.isRemote,
                            this.remoteRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupDestinationDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("backupDestinationAttachHistory")) {
                this.backupDestinationAttachHistory(model.getBackupDestinationAttachHistory());
            }
            if (model.wasPropertyExplicitlySet("spaceUtilizedInGBs")) {
                this.spaceUtilizedInGBs(model.getSpaceUtilizedInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeAtWhichStorageDetailsAreUpdated")) {
                this.timeAtWhichStorageDetailsAreUpdated(
                        model.getTimeAtWhichStorageDetailsAreUpdated());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("vpcUser")) {
                this.vpcUser(model.getVpcUser());
            }
            if (model.wasPropertyExplicitlySet("vpcPassword")) {
                this.vpcPassword(model.getVpcPassword());
            }
            if (model.wasPropertyExplicitlySet("internetProxy")) {
                this.internetProxy(model.getInternetProxy());
            }
            if (model.wasPropertyExplicitlySet("dbrsPolicyId")) {
                this.dbrsPolicyId(model.getDbrsPolicyId());
            }
            if (model.wasPropertyExplicitlySet("isRemote")) {
                this.isRemote(model.getIsRemote());
            }
            if (model.wasPropertyExplicitlySet("remoteRegion")) {
                this.remoteRegion(model.getRemoteRegion());
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

    /**
     * The timestamps at which this backup destination is used as the preferred destination to host
     * the Autonomous Container Database backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationAttachHistory")
    private final java.util.List<java.util.Date> backupDestinationAttachHistory;

    /**
     * The timestamps at which this backup destination is used as the preferred destination to host
     * the Autonomous Container Database backups.
     *
     * @return the value
     */
    public java.util.List<java.util.Date> getBackupDestinationAttachHistory() {
        return backupDestinationAttachHistory;
    }

    /**
     * The total space utilized (in GBs) by this Autonomous Container Database on this backup
     * destination, rounded to the nearest integer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spaceUtilizedInGBs")
    private final Integer spaceUtilizedInGBs;

    /**
     * The total space utilized (in GBs) by this Autonomous Container Database on this backup
     * destination, rounded to the nearest integer.
     *
     * @return the value
     */
    public Integer getSpaceUtilizedInGBs() {
        return spaceUtilizedInGBs;
    }

    /**
     * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are
     * updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
    private final java.util.Date timeAtWhichStorageDetailsAreUpdated;

    /**
     * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are
     * updated.
     *
     * @return the value
     */
    public java.util.Date getTimeAtWhichStorageDetailsAreUpdated() {
        return timeAtWhichStorageDetailsAreUpdated;
    }

    /** Type of the database backup destination. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Nfs("NFS"),
        RecoveryAppliance("RECOVERY_APPLIANCE"),
        ObjectStore("OBJECT_STORE"),
        Local("LOCAL"),
        Dbrs("DBRS"),
        AwsS3("AWS_S3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Type of the database backup destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the database backup destination.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is
     * used to access the Recovery Appliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpcUser")
    private final String vpcUser;

    /**
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is
     * used to access the Recovery Appliance.
     *
     * @return the value
     */
    public String getVpcUser() {
        return vpcUser;
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to
     * access the Recovery Appliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpcPassword")
    private final String vpcPassword;

    /**
     * For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to
     * access the Recovery Appliance.
     *
     * @return the value
     */
    public String getVpcPassword() {
        return vpcPassword;
    }

    /** Proxy URL to connect to object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("internetProxy")
    private final String internetProxy;

    /**
     * Proxy URL to connect to object store.
     *
     * @return the value
     */
    public String getInternetProxy() {
        return internetProxy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DBRS
     * policy used for backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbrsPolicyId")
    private final String dbrsPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DBRS
     * policy used for backup.
     *
     * @return the value
     */
    public String getDbrsPolicyId() {
        return dbrsPolicyId;
    }

    /** Indicates whether the backup destination is cross-region or local region. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRemote")
    private final Boolean isRemote;

    /**
     * Indicates whether the backup destination is cross-region or local region.
     *
     * @return the value
     */
    public Boolean getIsRemote() {
        return isRemote;
    }

    /**
     * The name of the remote region where the remote automatic incremental backups will be stored.
     *
     * <p>For information about valid region names, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteRegion")
    private final String remoteRegion;

    /**
     * The name of the remote region where the remote automatic incremental backups will be stored.
     *
     * <p>For information about valid region names, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm).
     *
     * @return the value
     */
    public String getRemoteRegion() {
        return remoteRegion;
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
        sb.append("BackupDestinationDetailsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("backupDestinationAttachHistory=")
                .append(String.valueOf(this.backupDestinationAttachHistory));
        sb.append(", spaceUtilizedInGBs=").append(String.valueOf(this.spaceUtilizedInGBs));
        sb.append(", timeAtWhichStorageDetailsAreUpdated=")
                .append(String.valueOf(this.timeAtWhichStorageDetailsAreUpdated));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", vpcUser=").append(String.valueOf(this.vpcUser));
        sb.append(", vpcPassword=").append(String.valueOf(this.vpcPassword));
        sb.append(", internetProxy=").append(String.valueOf(this.internetProxy));
        sb.append(", dbrsPolicyId=").append(String.valueOf(this.dbrsPolicyId));
        sb.append(", isRemote=").append(String.valueOf(this.isRemote));
        sb.append(", remoteRegion=").append(String.valueOf(this.remoteRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupDestinationDetailsSummary)) {
            return false;
        }

        BackupDestinationDetailsSummary other = (BackupDestinationDetailsSummary) o;
        return java.util.Objects.equals(
                        this.backupDestinationAttachHistory, other.backupDestinationAttachHistory)
                && java.util.Objects.equals(this.spaceUtilizedInGBs, other.spaceUtilizedInGBs)
                && java.util.Objects.equals(
                        this.timeAtWhichStorageDetailsAreUpdated,
                        other.timeAtWhichStorageDetailsAreUpdated)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vpcUser, other.vpcUser)
                && java.util.Objects.equals(this.vpcPassword, other.vpcPassword)
                && java.util.Objects.equals(this.internetProxy, other.internetProxy)
                && java.util.Objects.equals(this.dbrsPolicyId, other.dbrsPolicyId)
                && java.util.Objects.equals(this.isRemote, other.isRemote)
                && java.util.Objects.equals(this.remoteRegion, other.remoteRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupDestinationAttachHistory == null
                                ? 43
                                : this.backupDestinationAttachHistory.hashCode());
        result =
                (result * PRIME)
                        + (this.spaceUtilizedInGBs == null
                                ? 43
                                : this.spaceUtilizedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAtWhichStorageDetailsAreUpdated == null
                                ? 43
                                : this.timeAtWhichStorageDetailsAreUpdated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.vpcUser == null ? 43 : this.vpcUser.hashCode());
        result = (result * PRIME) + (this.vpcPassword == null ? 43 : this.vpcPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.internetProxy == null ? 43 : this.internetProxy.hashCode());
        result = (result * PRIME) + (this.dbrsPolicyId == null ? 43 : this.dbrsPolicyId.hashCode());
        result = (result * PRIME) + (this.isRemote == null ? 43 : this.isRemote.hashCode());
        result = (result * PRIME) + (this.remoteRegion == null ? 43 : this.remoteRegion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
