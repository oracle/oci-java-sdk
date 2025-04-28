/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of object privileges. <br>
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
        builder = ObjectPrivilegeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectPrivilegeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "schemaType",
        "owner",
        "grantor",
        "hierarchy",
        "object",
        "grantOption",
        "common",
        "inherited"
    })
    public ObjectPrivilegeSummary(
            String name,
            String schemaType,
            String owner,
            String grantor,
            Hierarchy hierarchy,
            String object,
            GrantOption grantOption,
            Common common,
            Inherited inherited) {
        super();
        this.name = name;
        this.schemaType = schemaType;
        this.owner = owner;
        this.grantor = grantor;
        this.hierarchy = hierarchy;
        this.object = object;
        this.grantOption = grantOption;
        this.common = common;
        this.inherited = inherited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the privilege on the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the privilege on the object.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of object. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
        private String schemaType;

        /**
         * The type of object.
         *
         * @param schemaType the value to set
         * @return this builder
         */
        public Builder schemaType(String schemaType) {
            this.schemaType = schemaType;
            this.__explicitlySet__.add("schemaType");
            return this;
        }
        /** The owner of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the object.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** The name of the user who granted the object privilege. */
        @com.fasterxml.jackson.annotation.JsonProperty("grantor")
        private String grantor;

        /**
         * The name of the user who granted the object privilege.
         *
         * @param grantor the value to set
         * @return this builder
         */
        public Builder grantor(String grantor) {
            this.grantor = grantor;
            this.__explicitlySet__.add("grantor");
            return this;
        }
        /**
         * Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hierarchy")
        private Hierarchy hierarchy;

        /**
         * Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO).
         *
         * @param hierarchy the value to set
         * @return this builder
         */
        public Builder hierarchy(Hierarchy hierarchy) {
            this.hierarchy = hierarchy;
            this.__explicitlySet__.add("hierarchy");
            return this;
        }
        /**
         * The name of the object. The object can be any object, including tables, packages,
         * indexes, sequences, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        /**
         * The name of the object. The object can be any object, including tables, packages,
         * indexes, sequences, and so on.
         *
         * @param object the value to set
         * @return this builder
         */
        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }
        /** Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO). */
        @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
        private GrantOption grantOption;

        /**
         * Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO).
         *
         * @param grantOption the value to set
         * @return this builder
         */
        public Builder grantOption(GrantOption grantOption) {
            this.grantOption = grantOption;
            this.__explicitlySet__.add("grantOption");
            return this;
        }
        /**
         * Indicates how the object privilege was granted. Possible values: YES if the role is
         * granted commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL
         * is not used)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        /**
         * Indicates how the object privilege was granted. Possible values: YES if the role is
         * granted commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL
         * is not used)
         *
         * @param common the value to set
         * @return this builder
         */
        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }
        /**
         * Indicates whether the granted privilege is inherited from another container (YES) or not
         * (NO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        /**
         * Indicates whether the granted privilege is inherited from another container (YES) or not
         * (NO).
         *
         * @param inherited the value to set
         * @return this builder
         */
        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectPrivilegeSummary build() {
            ObjectPrivilegeSummary model =
                    new ObjectPrivilegeSummary(
                            this.name,
                            this.schemaType,
                            this.owner,
                            this.grantor,
                            this.hierarchy,
                            this.object,
                            this.grantOption,
                            this.common,
                            this.inherited);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectPrivilegeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("schemaType")) {
                this.schemaType(model.getSchemaType());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("grantor")) {
                this.grantor(model.getGrantor());
            }
            if (model.wasPropertyExplicitlySet("hierarchy")) {
                this.hierarchy(model.getHierarchy());
            }
            if (model.wasPropertyExplicitlySet("object")) {
                this.object(model.getObject());
            }
            if (model.wasPropertyExplicitlySet("grantOption")) {
                this.grantOption(model.getGrantOption());
            }
            if (model.wasPropertyExplicitlySet("common")) {
                this.common(model.getCommon());
            }
            if (model.wasPropertyExplicitlySet("inherited")) {
                this.inherited(model.getInherited());
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

    /** The name of the privilege on the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the privilege on the object.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of object. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
    private final String schemaType;

    /**
     * The type of object.
     *
     * @return the value
     */
    public String getSchemaType() {
        return schemaType;
    }

    /** The owner of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the object.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The name of the user who granted the object privilege. */
    @com.fasterxml.jackson.annotation.JsonProperty("grantor")
    private final String grantor;

    /**
     * The name of the user who granted the object privilege.
     *
     * @return the value
     */
    public String getGrantor() {
        return grantor;
    }

    /** Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO). */
    public enum Hierarchy implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Hierarchy.class);

        private final String value;
        private static java.util.Map<String, Hierarchy> map;

        static {
            map = new java.util.HashMap<>();
            for (Hierarchy v : Hierarchy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Hierarchy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Hierarchy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Hierarchy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO). */
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchy")
    private final Hierarchy hierarchy;

    /**
     * Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO).
     *
     * @return the value
     */
    public Hierarchy getHierarchy() {
        return hierarchy;
    }

    /**
     * The name of the object. The object can be any object, including tables, packages, indexes,
     * sequences, and so on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    /**
     * The name of the object. The object can be any object, including tables, packages, indexes,
     * sequences, and so on.
     *
     * @return the value
     */
    public String getObject() {
        return object;
    }

    /** Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO). */
    public enum GrantOption implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GrantOption.class);

        private final String value;
        private static java.util.Map<String, GrantOption> map;

        static {
            map = new java.util.HashMap<>();
            for (GrantOption v : GrantOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GrantOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GrantOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GrantOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO). */
    @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
    private final GrantOption grantOption;

    /**
     * Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO).
     *
     * @return the value
     */
    public GrantOption getGrantOption() {
        return grantOption;
    }

    /**
     * Indicates how the object privilege was granted. Possible values: YES if the role is granted
     * commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL is not
     * used)
     */
    public enum Common implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Common.class);

        private final String value;
        private static java.util.Map<String, Common> map;

        static {
            map = new java.util.HashMap<>();
            for (Common v : Common.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Common(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Common create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Common', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the object privilege was granted. Possible values: YES if the role is granted
     * commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL is not
     * used)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    private final Common common;

    /**
     * Indicates how the object privilege was granted. Possible values: YES if the role is granted
     * commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL is not
     * used)
     *
     * @return the value
     */
    public Common getCommon() {
        return common;
    }

    /**
     * Indicates whether the granted privilege is inherited from another container (YES) or not
     * (NO).
     */
    public enum Inherited implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Inherited.class);

        private final String value;
        private static java.util.Map<String, Inherited> map;

        static {
            map = new java.util.HashMap<>();
            for (Inherited v : Inherited.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Inherited(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Inherited create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Inherited', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the granted privilege is inherited from another container (YES) or not
     * (NO).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    private final Inherited inherited;

    /**
     * Indicates whether the granted privilege is inherited from another container (YES) or not
     * (NO).
     *
     * @return the value
     */
    public Inherited getInherited() {
        return inherited;
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
        sb.append("ObjectPrivilegeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", schemaType=").append(String.valueOf(this.schemaType));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", grantor=").append(String.valueOf(this.grantor));
        sb.append(", hierarchy=").append(String.valueOf(this.hierarchy));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(", grantOption=").append(String.valueOf(this.grantOption));
        sb.append(", common=").append(String.valueOf(this.common));
        sb.append(", inherited=").append(String.valueOf(this.inherited));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectPrivilegeSummary)) {
            return false;
        }

        ObjectPrivilegeSummary other = (ObjectPrivilegeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.schemaType, other.schemaType)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.grantor, other.grantor)
                && java.util.Objects.equals(this.hierarchy, other.hierarchy)
                && java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.grantOption, other.grantOption)
                && java.util.Objects.equals(this.common, other.common)
                && java.util.Objects.equals(this.inherited, other.inherited)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.schemaType == null ? 43 : this.schemaType.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.grantor == null ? 43 : this.grantor.hashCode());
        result = (result * PRIME) + (this.hierarchy == null ? 43 : this.hierarchy.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + (this.grantOption == null ? 43 : this.grantOption.hashCode());
        result = (result * PRIME) + (this.common == null ? 43 : this.common.hashCode());
        result = (result * PRIME) + (this.inherited == null ? 43 : this.inherited.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
