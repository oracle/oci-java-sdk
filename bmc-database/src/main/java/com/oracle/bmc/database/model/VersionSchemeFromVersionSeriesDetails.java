/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The update should be applied on the database for the selected version series and preference. <br>
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
        builder = VersionSchemeFromVersionSeriesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VersionSchemeFromVersionSeriesDetails extends VersionSchemeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The update should be applied on the database for the selected major version series. The
         * value can be provided as 23.X.X.X then 23 major version series will be considered.
         *
         * <p>The list of supported versions can be obtained using the API for the provided shape
         * /20160918/dbVersions?compartmentId=<compartmentId>&dbSystemShape=ExaDbXS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("majorVersion")
        private String majorVersion;

        /**
         * The update should be applied on the database for the selected major version series. The
         * value can be provided as 23.X.X.X then 23 major version series will be considered.
         *
         * <p>The list of supported versions can be obtained using the API for the provided shape
         * /20160918/dbVersions?compartmentId=<compartmentId>&dbSystemShape=ExaDbXS
         *
         * @param majorVersion the value to set
         * @return this builder
         */
        public Builder majorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            this.__explicitlySet__.add("majorVersion");
            return this;
        }
        /**
         * The update should be applied on the database for the selected version preference. *_N
         * represents the LATEST version
         *
         * <p>For Ex: The current latest version is 23.7.0.0.0, If versionPreference selects option
         * as ORACLE_DB_N then oracle applies the db update with LATEST version (i.e. 23.7.0.0.0) If
         * versionPreference selects option as ORACLE_DB_N_1 then oracle applies the db update with
         * LATEST-1 version (i.e. 23.6.0.0.0) If versionPreference selects option as ORACLE_DB_N_2
         * then oracle applies the db update with LATEST-2 version (i.e. 23.5.0.0.0)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
        private VersionPreference versionPreference;

        /**
         * The update should be applied on the database for the selected version preference. *_N
         * represents the LATEST version
         *
         * <p>For Ex: The current latest version is 23.7.0.0.0, If versionPreference selects option
         * as ORACLE_DB_N then oracle applies the db update with LATEST version (i.e. 23.7.0.0.0) If
         * versionPreference selects option as ORACLE_DB_N_1 then oracle applies the db update with
         * LATEST-1 version (i.e. 23.6.0.0.0) If versionPreference selects option as ORACLE_DB_N_2
         * then oracle applies the db update with LATEST-2 version (i.e. 23.5.0.0.0)
         *
         * @param versionPreference the value to set
         * @return this builder
         */
        public Builder versionPreference(VersionPreference versionPreference) {
            this.versionPreference = versionPreference;
            this.__explicitlySet__.add("versionPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VersionSchemeFromVersionSeriesDetails build() {
            VersionSchemeFromVersionSeriesDetails model =
                    new VersionSchemeFromVersionSeriesDetails(
                            this.majorVersion, this.versionPreference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VersionSchemeFromVersionSeriesDetails model) {
            if (model.wasPropertyExplicitlySet("majorVersion")) {
                this.majorVersion(model.getMajorVersion());
            }
            if (model.wasPropertyExplicitlySet("versionPreference")) {
                this.versionPreference(model.getVersionPreference());
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

    @Deprecated
    public VersionSchemeFromVersionSeriesDetails(
            String majorVersion, VersionPreference versionPreference) {
        super();
        this.majorVersion = majorVersion;
        this.versionPreference = versionPreference;
    }

    /**
     * The update should be applied on the database for the selected major version series. The value
     * can be provided as 23.X.X.X then 23 major version series will be considered.
     *
     * <p>The list of supported versions can be obtained using the API for the provided shape
     * /20160918/dbVersions?compartmentId=<compartmentId>&dbSystemShape=ExaDbXS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("majorVersion")
    private final String majorVersion;

    /**
     * The update should be applied on the database for the selected major version series. The value
     * can be provided as 23.X.X.X then 23 major version series will be considered.
     *
     * <p>The list of supported versions can be obtained using the API for the provided shape
     * /20160918/dbVersions?compartmentId=<compartmentId>&dbSystemShape=ExaDbXS
     *
     * @return the value
     */
    public String getMajorVersion() {
        return majorVersion;
    }

    /**
     * The update should be applied on the database for the selected version preference. *_N
     * represents the LATEST version
     *
     * <p>For Ex: The current latest version is 23.7.0.0.0, If versionPreference selects option as
     * ORACLE_DB_N then oracle applies the db update with LATEST version (i.e. 23.7.0.0.0) If
     * versionPreference selects option as ORACLE_DB_N_1 then oracle applies the db update with
     * LATEST-1 version (i.e. 23.6.0.0.0) If versionPreference selects option as ORACLE_DB_N_2 then
     * oracle applies the db update with LATEST-2 version (i.e. 23.5.0.0.0)
     */
    public enum VersionPreference implements com.oracle.bmc.http.internal.BmcEnum {
        OracleDbN("ORACLE_DB_N"),
        OracleDbN1("ORACLE_DB_N_1"),
        OracleDbN2("ORACLE_DB_N_2"),
        OracleDbN3("ORACLE_DB_N_3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VersionPreference.class);

        private final String value;
        private static java.util.Map<String, VersionPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (VersionPreference v : VersionPreference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VersionPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VersionPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VersionPreference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The update should be applied on the database for the selected version preference. *_N
     * represents the LATEST version
     *
     * <p>For Ex: The current latest version is 23.7.0.0.0, If versionPreference selects option as
     * ORACLE_DB_N then oracle applies the db update with LATEST version (i.e. 23.7.0.0.0) If
     * versionPreference selects option as ORACLE_DB_N_1 then oracle applies the db update with
     * LATEST-1 version (i.e. 23.6.0.0.0) If versionPreference selects option as ORACLE_DB_N_2 then
     * oracle applies the db update with LATEST-2 version (i.e. 23.5.0.0.0)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
    private final VersionPreference versionPreference;

    /**
     * The update should be applied on the database for the selected version preference. *_N
     * represents the LATEST version
     *
     * <p>For Ex: The current latest version is 23.7.0.0.0, If versionPreference selects option as
     * ORACLE_DB_N then oracle applies the db update with LATEST version (i.e. 23.7.0.0.0) If
     * versionPreference selects option as ORACLE_DB_N_1 then oracle applies the db update with
     * LATEST-1 version (i.e. 23.6.0.0.0) If versionPreference selects option as ORACLE_DB_N_2 then
     * oracle applies the db update with LATEST-2 version (i.e. 23.5.0.0.0)
     *
     * @return the value
     */
    public VersionPreference getVersionPreference() {
        return versionPreference;
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
        sb.append("VersionSchemeFromVersionSeriesDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", majorVersion=").append(String.valueOf(this.majorVersion));
        sb.append(", versionPreference=").append(String.valueOf(this.versionPreference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VersionSchemeFromVersionSeriesDetails)) {
            return false;
        }

        VersionSchemeFromVersionSeriesDetails other = (VersionSchemeFromVersionSeriesDetails) o;
        return java.util.Objects.equals(this.majorVersion, other.majorVersion)
                && java.util.Objects.equals(this.versionPreference, other.versionPreference)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.majorVersion == null ? 43 : this.majorVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.versionPreference == null ? 43 : this.versionPreference.hashCode());
        return result;
    }
}
