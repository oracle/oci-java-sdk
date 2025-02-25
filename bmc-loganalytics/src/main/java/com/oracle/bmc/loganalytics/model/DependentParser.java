/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A parser used by another parser.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DependentParser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DependentParser extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parserName",
        "parserDisplayName",
        "parserId",
        "isSystem",
        "parserType",
        "dependencies"
    })
    public DependentParser(
            String parserName,
            String parserDisplayName,
            Long parserId,
            Boolean isSystem,
            ParserType parserType,
            java.util.List<Dependency> dependencies) {
        super();
        this.parserName = parserName;
        this.parserDisplayName = parserDisplayName;
        this.parserId = parserId;
        this.isSystem = isSystem;
        this.parserType = parserType;
        this.dependencies = dependencies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parser name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        /**
         * The parser name.
         * @param parserName the value to set
         * @return this builder
         **/
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }
        /**
         * The parser display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserDisplayName")
        private String parserDisplayName;

        /**
         * The parser display name.
         * @param parserDisplayName the value to set
         * @return this builder
         **/
        public Builder parserDisplayName(String parserDisplayName) {
            this.parserDisplayName = parserDisplayName;
            this.__explicitlySet__.add("parserDisplayName");
            return this;
        }
        /**
         * The parser unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserId")
        private Long parserId;

        /**
         * The parser unique identifier.
         * @param parserId the value to set
         * @return this builder
         **/
        public Builder parserId(Long parserId) {
            this.parserId = parserId;
            this.__explicitlySet__.add("parserId");
            return this;
        }
        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * The parser type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserType")
        private ParserType parserType;

        /**
         * The parser type
         * @param parserType the value to set
         * @return this builder
         **/
        public Builder parserType(ParserType parserType) {
            this.parserType = parserType;
            this.__explicitlySet__.add("parserType");
            return this;
        }
        /**
         * The list of dependencies of the parser.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        private java.util.List<Dependency> dependencies;

        /**
         * The list of dependencies of the parser.
         * @param dependencies the value to set
         * @return this builder
         **/
        public Builder dependencies(java.util.List<Dependency> dependencies) {
            this.dependencies = dependencies;
            this.__explicitlySet__.add("dependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DependentParser build() {
            DependentParser model =
                    new DependentParser(
                            this.parserName,
                            this.parserDisplayName,
                            this.parserId,
                            this.isSystem,
                            this.parserType,
                            this.dependencies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependentParser model) {
            if (model.wasPropertyExplicitlySet("parserName")) {
                this.parserName(model.getParserName());
            }
            if (model.wasPropertyExplicitlySet("parserDisplayName")) {
                this.parserDisplayName(model.getParserDisplayName());
            }
            if (model.wasPropertyExplicitlySet("parserId")) {
                this.parserId(model.getParserId());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("parserType")) {
                this.parserType(model.getParserType());
            }
            if (model.wasPropertyExplicitlySet("dependencies")) {
                this.dependencies(model.getDependencies());
            }
            return this;
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
     * The parser name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    private final String parserName;

    /**
     * The parser name.
     * @return the value
     **/
    public String getParserName() {
        return parserName;
    }

    /**
     * The parser display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserDisplayName")
    private final String parserDisplayName;

    /**
     * The parser display name.
     * @return the value
     **/
    public String getParserDisplayName() {
        return parserDisplayName;
    }

    /**
     * The parser unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserId")
    private final Long parserId;

    /**
     * The parser unique identifier.
     * @return the value
     **/
    public Long getParserId() {
        return parserId;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The parser type
     **/
    public enum ParserType {
        Xml("XML"),
        Json("JSON"),
        Regex("REGEX"),
        Odl("ODL"),
        Delimited("DELIMITED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ParserType.class);

        private final String value;
        private static java.util.Map<String, ParserType> map;

        static {
            map = new java.util.HashMap<>();
            for (ParserType v : ParserType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ParserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ParserType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The parser type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserType")
    private final ParserType parserType;

    /**
     * The parser type
     * @return the value
     **/
    public ParserType getParserType() {
        return parserType;
    }

    /**
     * The list of dependencies of the parser.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<Dependency> dependencies;

    /**
     * The list of dependencies of the parser.
     * @return the value
     **/
    public java.util.List<Dependency> getDependencies() {
        return dependencies;
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
        sb.append("DependentParser(");
        sb.append("super=").append(super.toString());
        sb.append("parserName=").append(String.valueOf(this.parserName));
        sb.append(", parserDisplayName=").append(String.valueOf(this.parserDisplayName));
        sb.append(", parserId=").append(String.valueOf(this.parserId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", parserType=").append(String.valueOf(this.parserType));
        sb.append(", dependencies=").append(String.valueOf(this.dependencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DependentParser)) {
            return false;
        }

        DependentParser other = (DependentParser) o;
        return java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(this.parserDisplayName, other.parserDisplayName)
                && java.util.Objects.equals(this.parserId, other.parserId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.parserType, other.parserType)
                && java.util.Objects.equals(this.dependencies, other.dependencies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserDisplayName == null ? 43 : this.parserDisplayName.hashCode());
        result = (result * PRIME) + (this.parserId == null ? 43 : this.parserId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.parserType == null ? 43 : this.parserType.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
