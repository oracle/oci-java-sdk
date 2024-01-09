/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Describes the parameters required to update a protected database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateProtectedDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateProtectedDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "databaseSize",
        "databaseSizeInGBs",
        "password",
        "protectionPolicyId",
        "recoveryServiceSubnets",
        "isRedoLogsShipped",
        "freeformTags",
        "definedTags"
    })
    public UpdateProtectedDatabaseDetails(
            String displayName,
            DatabaseSizes databaseSize,
            Integer databaseSizeInGBs,
            String password,
            String protectionPolicyId,
            java.util.List<RecoveryServiceSubnetInput> recoveryServiceSubnets,
            Boolean isRedoLogsShipped,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.databaseSize = databaseSize;
        this.databaseSizeInGBs = databaseSizeInGBs;
        this.password = password;
        this.protectionPolicyId = protectionPolicyId;
        this.recoveryServiceSubnets = recoveryServiceSubnets;
        this.isRedoLogsShipped = isRedoLogsShipped;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The protected database name. You can change the displayName. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The protected database name. You can change the displayName. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The size of the database is allowed to be decreased. XS - Less than 5GB, S - 5GB to 50GB,
         * M - 50GB to 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSize")
        private DatabaseSizes databaseSize;

        /**
         * The size of the database is allowed to be decreased. XS - Less than 5GB, S - 5GB to 50GB,
         * M - 50GB to 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
         *
         * @param databaseSize the value to set
         * @return this builder
         */
        public Builder databaseSize(DatabaseSizes databaseSize) {
            this.databaseSize = databaseSize;
            this.__explicitlySet__.add("databaseSize");
            return this;
        }
        /** The size of the database, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
        private Integer databaseSizeInGBs;

        /**
         * The size of the database, in gigabytes.
         *
         * @param databaseSizeInGBs the value to set
         * @return this builder
         */
        public Builder databaseSizeInGBs(Integer databaseSizeInGBs) {
            this.databaseSizeInGBs = databaseSizeInGBs;
            this.__explicitlySet__.add("databaseSizeInGBs");
            return this;
        }
        /**
         * Password credential which can be used to connect to Protected Database. It must contain
         * at least 2 uppercase, 2 lowercase, 2 numeric and 2 special characters. The special
         * characters must be underscore (_), number sign (#) or hyphen (-). The password must not
         * contain the username "admin", regardless of casing. Password must not be same as current
         * passsword.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * Password credential which can be used to connect to Protected Database. It must contain
         * at least 2 uppercase, 2 lowercase, 2 numeric and 2 special characters. The special
         * characters must be underscore (_), number sign (#) or hyphen (-). The password must not
         * contain the username "admin", regardless of casing. Password must not be same as current
         * passsword.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** The OCID of the protection policy associated with the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionPolicyId")
        private String protectionPolicyId;

        /**
         * The OCID of the protection policy associated with the protected database.
         *
         * @param protectionPolicyId the value to set
         * @return this builder
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            this.__explicitlySet__.add("protectionPolicyId");
            return this;
        }
        /** List of recovery service subnet resources associated with the protected database. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnets")
        private java.util.List<RecoveryServiceSubnetInput> recoveryServiceSubnets;

        /**
         * List of recovery service subnet resources associated with the protected database.
         *
         * @param recoveryServiceSubnets the value to set
         * @return this builder
         */
        public Builder recoveryServiceSubnets(
                java.util.List<RecoveryServiceSubnetInput> recoveryServiceSubnets) {
            this.recoveryServiceSubnets = recoveryServiceSubnets;
            this.__explicitlySet__.add("recoveryServiceSubnets");
            return this;
        }
        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups. For this to be effective, additional
         * configuration is needed on client side.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsShipped")
        private Boolean isRedoLogsShipped;

        /**
         * The value TRUE indicates that the protected database is configured to use Real-time data
         * protection, and redo-data is sent from the protected database to Recovery Service.
         * Real-time data protection substantially reduces the window of potential data loss that
         * exists between successive archived redo log backups. For this to be effective, additional
         * configuration is needed on client side.
         *
         * @param isRedoLogsShipped the value to set
         * @return this builder
         */
        public Builder isRedoLogsShipped(Boolean isRedoLogsShipped) {
            this.isRedoLogsShipped = isRedoLogsShipped;
            this.__explicitlySet__.add("isRedoLogsShipped");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateProtectedDatabaseDetails build() {
            UpdateProtectedDatabaseDetails model =
                    new UpdateProtectedDatabaseDetails(
                            this.displayName,
                            this.databaseSize,
                            this.databaseSizeInGBs,
                            this.password,
                            this.protectionPolicyId,
                            this.recoveryServiceSubnets,
                            this.isRedoLogsShipped,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateProtectedDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseSize")) {
                this.databaseSize(model.getDatabaseSize());
            }
            if (model.wasPropertyExplicitlySet("databaseSizeInGBs")) {
                this.databaseSizeInGBs(model.getDatabaseSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("protectionPolicyId")) {
                this.protectionPolicyId(model.getProtectionPolicyId());
            }
            if (model.wasPropertyExplicitlySet("recoveryServiceSubnets")) {
                this.recoveryServiceSubnets(model.getRecoveryServiceSubnets());
            }
            if (model.wasPropertyExplicitlySet("isRedoLogsShipped")) {
                this.isRedoLogsShipped(model.getIsRedoLogsShipped());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The protected database name. You can change the displayName. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The protected database name. You can change the displayName. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The size of the database is allowed to be decreased. XS - Less than 5GB, S - 5GB to 50GB, M -
     * 50GB to 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSize")
    private final DatabaseSizes databaseSize;

    /**
     * The size of the database is allowed to be decreased. XS - Less than 5GB, S - 5GB to 50GB, M -
     * 50GB to 500GB, L - 500GB to 1TB, XL - 1TB to 5TB, XXL - Greater than 5TB.
     *
     * @return the value
     */
    public DatabaseSizes getDatabaseSize() {
        return databaseSize;
    }

    /** The size of the database, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSizeInGBs")
    private final Integer databaseSizeInGBs;

    /**
     * The size of the database, in gigabytes.
     *
     * @return the value
     */
    public Integer getDatabaseSizeInGBs() {
        return databaseSizeInGBs;
    }

    /**
     * Password credential which can be used to connect to Protected Database. It must contain at
     * least 2 uppercase, 2 lowercase, 2 numeric and 2 special characters. The special characters
     * must be underscore (_), number sign (#) or hyphen (-). The password must not contain the
     * username "admin", regardless of casing. Password must not be same as current passsword.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * Password credential which can be used to connect to Protected Database. It must contain at
     * least 2 uppercase, 2 lowercase, 2 numeric and 2 special characters. The special characters
     * must be underscore (_), number sign (#) or hyphen (-). The password must not contain the
     * username "admin", regardless of casing. Password must not be same as current passsword.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /** The OCID of the protection policy associated with the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionPolicyId")
    private final String protectionPolicyId;

    /**
     * The OCID of the protection policy associated with the protected database.
     *
     * @return the value
     */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }

    /** List of recovery service subnet resources associated with the protected database. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnets")
    private final java.util.List<RecoveryServiceSubnetInput> recoveryServiceSubnets;

    /**
     * List of recovery service subnet resources associated with the protected database.
     *
     * @return the value
     */
    public java.util.List<RecoveryServiceSubnetInput> getRecoveryServiceSubnets() {
        return recoveryServiceSubnets;
    }

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups. For this to be effective, additional configuration is
     * needed on client side.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRedoLogsShipped")
    private final Boolean isRedoLogsShipped;

    /**
     * The value TRUE indicates that the protected database is configured to use Real-time data
     * protection, and redo-data is sent from the protected database to Recovery Service. Real-time
     * data protection substantially reduces the window of potential data loss that exists between
     * successive archived redo log backups. For this to be effective, additional configuration is
     * needed on client side.
     *
     * @return the value
     */
    public Boolean getIsRedoLogsShipped() {
        return isRedoLogsShipped;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateProtectedDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseSize=").append(String.valueOf(this.databaseSize));
        sb.append(", databaseSizeInGBs=").append(String.valueOf(this.databaseSizeInGBs));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", protectionPolicyId=").append(String.valueOf(this.protectionPolicyId));
        sb.append(", recoveryServiceSubnets=").append(String.valueOf(this.recoveryServiceSubnets));
        sb.append(", isRedoLogsShipped=").append(String.valueOf(this.isRedoLogsShipped));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProtectedDatabaseDetails)) {
            return false;
        }

        UpdateProtectedDatabaseDetails other = (UpdateProtectedDatabaseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseSize, other.databaseSize)
                && java.util.Objects.equals(this.databaseSizeInGBs, other.databaseSizeInGBs)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.protectionPolicyId, other.protectionPolicyId)
                && java.util.Objects.equals(
                        this.recoveryServiceSubnets, other.recoveryServiceSubnets)
                && java.util.Objects.equals(this.isRedoLogsShipped, other.isRedoLogsShipped)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.databaseSize == null ? 43 : this.databaseSize.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSizeInGBs == null ? 43 : this.databaseSizeInGBs.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionPolicyId == null
                                ? 43
                                : this.protectionPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryServiceSubnets == null
                                ? 43
                                : this.recoveryServiceSubnets.hashCode());
        result =
                (result * PRIME)
                        + (this.isRedoLogsShipped == null ? 43 : this.isRedoLogsShipped.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
