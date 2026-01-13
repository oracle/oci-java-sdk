/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * A WebLogic patch. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Patch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Patch extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "weblogicVersion",
        "middlewareType",
        "osArch"
    })
    public Patch(
            String id,
            String displayName,
            String description,
            String weblogicVersion,
            java.util.List<MiddlewareType> middlewareType,
            String osArch) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.weblogicVersion = weblogicVersion;
        this.middlewareType = middlewareType;
        this.osArch = osArch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the WebLogic patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the WebLogic patch.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the WebLogic patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the WebLogic patch.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the WebLogic patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the WebLogic patch.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The WebLogic version for this patch. The patch can be installed to domains with this
         * version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weblogicVersion")
        private String weblogicVersion;

        /**
         * The WebLogic version for this patch. The patch can be installed to domains with this
         * version.
         *
         * @param weblogicVersion the value to set
         * @return this builder
         */
        public Builder weblogicVersion(String weblogicVersion) {
            this.weblogicVersion = weblogicVersion;
            this.__explicitlySet__.add("weblogicVersion");
            return this;
        }
        /**
         * The type of middleware for which this patch is applicable. A patch can be applicable to
         * more than one type of middleware.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("middlewareType")
        private java.util.List<MiddlewareType> middlewareType;

        /**
         * The type of middleware for which this patch is applicable. A patch can be applicable to
         * more than one type of middleware.
         *
         * @param middlewareType the value to set
         * @return this builder
         */
        public Builder middlewareType(java.util.List<MiddlewareType> middlewareType) {
            this.middlewareType = middlewareType;
            this.__explicitlySet__.add("middlewareType");
            return this;
        }
        /** The operating system architecture for which the patch can be applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("osArch")
        private String osArch;

        /**
         * The operating system architecture for which the patch can be applied.
         *
         * @param osArch the value to set
         * @return this builder
         */
        public Builder osArch(String osArch) {
            this.osArch = osArch;
            this.__explicitlySet__.add("osArch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Patch build() {
            Patch model =
                    new Patch(
                            this.id,
                            this.displayName,
                            this.description,
                            this.weblogicVersion,
                            this.middlewareType,
                            this.osArch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Patch model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("weblogicVersion")) {
                this.weblogicVersion(model.getWeblogicVersion());
            }
            if (model.wasPropertyExplicitlySet("middlewareType")) {
                this.middlewareType(model.getMiddlewareType());
            }
            if (model.wasPropertyExplicitlySet("osArch")) {
                this.osArch(model.getOsArch());
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

    /** The ID of the WebLogic patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the WebLogic patch.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the WebLogic patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the WebLogic patch.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the WebLogic patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the WebLogic patch.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The WebLogic version for this patch. The patch can be installed to domains with this version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicVersion")
    private final String weblogicVersion;

    /**
     * The WebLogic version for this patch. The patch can be installed to domains with this version.
     *
     * @return the value
     */
    public String getWeblogicVersion() {
        return weblogicVersion;
    }

    /** */
    public enum MiddlewareType implements com.oracle.bmc.http.internal.BmcEnum {
        Fmw("FMW"),
        Wls("WLS"),
        Opatch("OPATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MiddlewareType.class);

        private final String value;
        private static java.util.Map<String, MiddlewareType> map;

        static {
            map = new java.util.HashMap<>();
            for (MiddlewareType v : MiddlewareType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MiddlewareType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MiddlewareType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MiddlewareType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of middleware for which this patch is applicable. A patch can be applicable to more
     * than one type of middleware.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("middlewareType")
    private final java.util.List<MiddlewareType> middlewareType;

    /**
     * The type of middleware for which this patch is applicable. A patch can be applicable to more
     * than one type of middleware.
     *
     * @return the value
     */
    public java.util.List<MiddlewareType> getMiddlewareType() {
        return middlewareType;
    }

    /** The operating system architecture for which the patch can be applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("osArch")
    private final String osArch;

    /**
     * The operating system architecture for which the patch can be applied.
     *
     * @return the value
     */
    public String getOsArch() {
        return osArch;
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
        sb.append("Patch(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", weblogicVersion=").append(String.valueOf(this.weblogicVersion));
        sb.append(", middlewareType=").append(String.valueOf(this.middlewareType));
        sb.append(", osArch=").append(String.valueOf(this.osArch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Patch)) {
            return false;
        }

        Patch other = (Patch) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.weblogicVersion, other.weblogicVersion)
                && java.util.Objects.equals(this.middlewareType, other.middlewareType)
                && java.util.Objects.equals(this.osArch, other.osArch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.weblogicVersion == null ? 43 : this.weblogicVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.middlewareType == null ? 43 : this.middlewareType.hashCode());
        result = (result * PRIME) + (this.osArch == null ? 43 : this.osArch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
