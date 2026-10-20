/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Upgrade details for the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpgradeDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbVersion", "configId", "options"})
    public UpgradeDbSystemDetails(
            String dbVersion, String configId, java.util.List<Options> options) {
        super();
        this.dbVersion = dbVersion;
        this.configId = configId;
        this.options = options;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The target major version of the database system software. Example: "17" */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The target major version of the database system software. Example: "17"
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration for target database version to be associated with database system.
         * Optional, if database system is currently running with default configuration object.
         * Mandatory, if database system is currently running with custom configuration object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration for target database version to be associated with database system.
         * Optional, if database system is currently running with default configuration object.
         * Mandatory, if database system is currently running with custom configuration object.
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }
        /**
         * Optional post-upgrade operations to run. Verification and vacuum are skipped unless their
         * corresponding options are included. If omitted or empty, both operations are skipped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<Options> options;

        /**
         * Optional post-upgrade operations to run. Verification and vacuum are skipped unless their
         * corresponding options are included. If omitted or empty, both operations are skipped.
         *
         * @param options the value to set
         * @return this builder
         */
        public Builder options(java.util.List<Options> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeDbSystemDetails build() {
            UpgradeDbSystemDetails model =
                    new UpgradeDbSystemDetails(this.dbVersion, this.configId, this.options);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
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

    /** The target major version of the database system software. Example: "17" */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The target major version of the database system software. Example: "17"
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration for target database version to be associated with database system. Optional, if
     * database system is currently running with default configuration object. Mandatory, if
     * database system is currently running with custom configuration object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration for target database version to be associated with database system. Optional, if
     * database system is currently running with default configuration object. Mandatory, if
     * database system is currently running with custom configuration object.
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
    }

    /** */
    public enum Options implements com.oracle.bmc.http.internal.BmcEnum {
        RunPostUpgradeVerification("RUN_POST_UPGRADE_VERIFICATION"),
        RunPostUpgradeVacuum("RUN_POST_UPGRADE_VACUUM"),
        ;

        private final String value;
        private static java.util.Map<String, Options> map;

        static {
            map = new java.util.HashMap<>();
            for (Options v : Options.values()) {
                map.put(v.getValue(), v);
            }
        }

        Options(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Options create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Options: " + key);
        }
    };
    /**
     * Optional post-upgrade operations to run. Verification and vacuum are skipped unless their
     * corresponding options are included. If omitted or empty, both operations are skipped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.List<Options> options;

    /**
     * Optional post-upgrade operations to run. Verification and vacuum are skipped unless their
     * corresponding options are included. If omitted or empty, both operations are skipped.
     *
     * @return the value
     */
    public java.util.List<Options> getOptions() {
        return options;
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
        sb.append("UpgradeDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", configId=").append(String.valueOf(this.configId));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeDbSystemDetails)) {
            return false;
        }

        UpgradeDbSystemDetails other = (UpgradeDbSystemDetails) o;
        return java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.configId, other.configId)
                && java.util.Objects.equals(this.options, other.options)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
