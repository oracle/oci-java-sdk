/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information about new Integration Cloud instance being provisioned.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOicServiceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "serviceInstanceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOicServiceInstanceDetails extends CreateServiceInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Number of 5K message packs per hour
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        /**
         * Number of 5K message packs per hour
         * @param messagePacks the value to set
         * @return this builder
         **/
        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }
        /**
         * The   Oracle Integration edition
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("edition")
        private Edition edition;

        /**
         * The   Oracle Integration edition
         * @param edition the value to set
         * @return this builder
         **/
        public Builder edition(Edition edition) {
            this.edition = edition;
            this.__explicitlySet__.add("edition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOicServiceInstanceDetails build() {
            CreateOicServiceInstanceDetails __instance__ =
                    new CreateOicServiceInstanceDetails(
                            displayName, compartmentId, messagePacks, edition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOicServiceInstanceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .messagePacks(o.getMessagePacks())
                            .edition(o.getEdition());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public CreateOicServiceInstanceDetails(
            String displayName, String compartmentId, Integer messagePacks, Edition edition) {
        super(displayName, compartmentId);
        this.messagePacks = messagePacks;
        this.edition = edition;
    }

    /**
     * Number of 5K message packs per hour
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    private final Integer messagePacks;

    /**
     * Number of 5K message packs per hour
     * @return the value
     **/
    public Integer getMessagePacks() {
        return messagePacks;
    }

    /**
     * The   Oracle Integration edition
     **/
    public enum Edition {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),
        ;

        private final String value;
        private static java.util.Map<String, Edition> map;

        static {
            map = new java.util.HashMap<>();
            for (Edition v : Edition.values()) {
                map.put(v.getValue(), v);
            }
        }

        Edition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Edition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Edition: " + key);
        }
    };
    /**
     * The   Oracle Integration edition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("edition")
    private final Edition edition;

    /**
     * The   Oracle Integration edition
     * @return the value
     **/
    public Edition getEdition() {
        return edition;
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
        sb.append("CreateOicServiceInstanceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", messagePacks=").append(String.valueOf(this.messagePacks));
        sb.append(", edition=").append(String.valueOf(this.edition));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOicServiceInstanceDetails)) {
            return false;
        }

        CreateOicServiceInstanceDetails other = (CreateOicServiceInstanceDetails) o;
        return java.util.Objects.equals(this.messagePacks, other.messagePacks)
                && java.util.Objects.equals(this.edition, other.edition)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.messagePacks == null ? 43 : this.messagePacks.hashCode());
        result = (result * PRIME) + (this.edition == null ? 43 : this.edition.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
