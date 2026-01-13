/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * It describes the various upgrade properties such as component, osversion, giversion for any VM DB
 * system. <br>
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
        builder = DbSystemUpgradeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbSystemUpgradeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"component", "osVersion", "giVersion"})
    public DbSystemUpgradeSummary(Component component, String osVersion, String giVersion) {
        super();
        this.component = component;
        this.osVersion = osVersion;
        this.giVersion = giVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The component on which upgrade is applicable. OS (Operating System upgrade), GI (Grid
         * Infrastructure upgrade) or OS_GI (both Operating System and Grid Infrastructure upgrade)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private Component component;

        /**
         * The component on which upgrade is applicable. OS (Operating System upgrade), GI (Grid
         * Infrastructure upgrade) or OS_GI (both Operating System and Grid Infrastructure upgrade)
         *
         * @param component the value to set
         * @return this builder
         */
        public Builder component(Component component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /** The version of the OS for this upgrade eg. Oracle Linux Server release 7.9 */
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * The version of the OS for this upgrade eg. Oracle Linux Server release 7.9
         *
         * @param osVersion the value to set
         * @return this builder
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /**
         * The version of the grid infrastructure for this upgrade. This is only applicable for ASM
         * based DbSystems
         */
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * The version of the grid infrastructure for this upgrade. This is only applicable for ASM
         * based DbSystems
         *
         * @param giVersion the value to set
         * @return this builder
         */
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemUpgradeSummary build() {
            DbSystemUpgradeSummary model =
                    new DbSystemUpgradeSummary(this.component, this.osVersion, this.giVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemUpgradeSummary model) {
            if (model.wasPropertyExplicitlySet("component")) {
                this.component(model.getComponent());
            }
            if (model.wasPropertyExplicitlySet("osVersion")) {
                this.osVersion(model.getOsVersion());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
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
     * The component on which upgrade is applicable. OS (Operating System upgrade), GI (Grid
     * Infrastructure upgrade) or OS_GI (both Operating System and Grid Infrastructure upgrade)
     */
    public enum Component implements com.oracle.bmc.http.internal.BmcEnum {
        Os("OS"),
        OsGi("OS_GI"),
        Gi("GI"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Component.class);

        private final String value;
        private static java.util.Map<String, Component> map;

        static {
            map = new java.util.HashMap<>();
            for (Component v : Component.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Component(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Component create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Component', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The component on which upgrade is applicable. OS (Operating System upgrade), GI (Grid
     * Infrastructure upgrade) or OS_GI (both Operating System and Grid Infrastructure upgrade)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final Component component;

    /**
     * The component on which upgrade is applicable. OS (Operating System upgrade), GI (Grid
     * Infrastructure upgrade) or OS_GI (both Operating System and Grid Infrastructure upgrade)
     *
     * @return the value
     */
    public Component getComponent() {
        return component;
    }

    /** The version of the OS for this upgrade eg. Oracle Linux Server release 7.9 */
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * The version of the OS for this upgrade eg. Oracle Linux Server release 7.9
     *
     * @return the value
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * The version of the grid infrastructure for this upgrade. This is only applicable for ASM
     * based DbSystems
     */
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * The version of the grid infrastructure for this upgrade. This is only applicable for ASM
     * based DbSystems
     *
     * @return the value
     */
    public String getGiVersion() {
        return giVersion;
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
        sb.append("DbSystemUpgradeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("component=").append(String.valueOf(this.component));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemUpgradeSummary)) {
            return false;
        }

        DbSystemUpgradeSummary other = (DbSystemUpgradeSummary) o;
        return java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
