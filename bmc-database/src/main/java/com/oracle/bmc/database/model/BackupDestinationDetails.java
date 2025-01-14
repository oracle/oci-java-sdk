/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup destination details <br>
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
        builder = BackupDestinationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupDestinationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "id",
        "vpcUser",
        "vpcPassword",
        "internetProxy",
        "dbrsPolicyId"
    })
    public BackupDestinationDetails(
            Type type,
            String id,
            String vpcUser,
            String vpcPassword,
            String internetProxy,
            String dbrsPolicyId) {
        super();
        this.type = type;
        this.id = id;
        this.vpcUser = vpcUser;
        this.vpcPassword = vpcPassword;
        this.internetProxy = internetProxy;
        this.dbrsPolicyId = dbrsPolicyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DBRS policy used for backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbrsPolicyId")
        private String dbrsPolicyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupDestinationDetails build() {
            BackupDestinationDetails model =
                    new BackupDestinationDetails(
                            this.type,
                            this.id,
                            this.vpcUser,
                            this.vpcPassword,
                            this.internetProxy,
                            this.dbrsPolicyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupDestinationDetails model) {
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

    /** Type of the database backup destination. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Nfs("NFS"),
        RecoveryAppliance("RECOVERY_APPLIANCE"),
        ObjectStore("OBJECT_STORE"),
        Local("LOCAL"),
        Dbrs("DBRS"),

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * DBRS policy used for backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbrsPolicyId")
    private final String dbrsPolicyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * DBRS policy used for backup.
     *
     * @return the value
     */
    public String getDbrsPolicyId() {
        return dbrsPolicyId;
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
        sb.append("BackupDestinationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", vpcUser=").append(String.valueOf(this.vpcUser));
        sb.append(", vpcPassword=").append(String.valueOf(this.vpcPassword));
        sb.append(", internetProxy=").append(String.valueOf(this.internetProxy));
        sb.append(", dbrsPolicyId=").append(String.valueOf(this.dbrsPolicyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupDestinationDetails)) {
            return false;
        }

        BackupDestinationDetails other = (BackupDestinationDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vpcUser, other.vpcUser)
                && java.util.Objects.equals(this.vpcPassword, other.vpcPassword)
                && java.util.Objects.equals(this.internetProxy, other.internetProxy)
                && java.util.Objects.equals(this.dbrsPolicyId, other.dbrsPolicyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.vpcUser == null ? 43 : this.vpcUser.hashCode());
        result = (result * PRIME) + (this.vpcPassword == null ? 43 : this.vpcPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.internetProxy == null ? 43 : this.internetProxy.hashCode());
        result = (result * PRIME) + (this.dbrsPolicyId == null ? 43 : this.dbrsPolicyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
