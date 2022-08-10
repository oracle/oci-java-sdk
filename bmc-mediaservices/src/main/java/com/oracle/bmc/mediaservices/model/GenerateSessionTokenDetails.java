/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Information about the new session token.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateSessionTokenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateSessionTokenDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeExpires", "scopes", "packagingConfigId", "assetIds"})
    public GenerateSessionTokenDetails(
            java.util.Date timeExpires,
            java.util.List<Scopes> scopes,
            String packagingConfigId,
            java.util.List<String> assetIds) {
        super();
        this.timeExpires = timeExpires;
        this.scopes = scopes;
        this.packagingConfigId = packagingConfigId;
        this.assetIds = assetIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Token expiry time. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * Token expiry time. An RFC3339 formatted datetime string.
         * @param timeExpires the value to set
         * @return this builder
         **/
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * Array of scopes the token can act upon.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<Scopes> scopes;

        /**
         * Array of scopes the token can act upon.
         * @param scopes the value to set
         * @return this builder
         **/
        public Builder scopes(java.util.List<Scopes> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }
        /**
         * The packaging config resource identifier used to limit the scope of the token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packagingConfigId")
        private String packagingConfigId;

        /**
         * The packaging config resource identifier used to limit the scope of the token.
         * @param packagingConfigId the value to set
         * @return this builder
         **/
        public Builder packagingConfigId(String packagingConfigId) {
            this.packagingConfigId = packagingConfigId;
            this.__explicitlySet__.add("packagingConfigId");
            return this;
        }
        /**
         * Array of asset resource IDs used to limit the scope of the token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assetIds")
        private java.util.List<String> assetIds;

        /**
         * Array of asset resource IDs used to limit the scope of the token.
         * @param assetIds the value to set
         * @return this builder
         **/
        public Builder assetIds(java.util.List<String> assetIds) {
            this.assetIds = assetIds;
            this.__explicitlySet__.add("assetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateSessionTokenDetails build() {
            GenerateSessionTokenDetails model =
                    new GenerateSessionTokenDetails(
                            this.timeExpires, this.scopes, this.packagingConfigId, this.assetIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateSessionTokenDetails model) {
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("scopes")) {
                this.scopes(model.getScopes());
            }
            if (model.wasPropertyExplicitlySet("packagingConfigId")) {
                this.packagingConfigId(model.getPackagingConfigId());
            }
            if (model.wasPropertyExplicitlySet("assetIds")) {
                this.assetIds(model.getAssetIds());
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
     * Token expiry time. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * Token expiry time. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     **/
    public enum Scopes {
        Playlist("PLAYLIST"),
        Edge("EDGE"),
        ;

        private final String value;
        private static java.util.Map<String, Scopes> map;

        static {
            map = new java.util.HashMap<>();
            for (Scopes v : Scopes.values()) {
                map.put(v.getValue(), v);
            }
        }

        Scopes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scopes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Scopes: " + key);
        }
    };
    /**
     * Array of scopes the token can act upon.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<Scopes> scopes;

    /**
     * Array of scopes the token can act upon.
     * @return the value
     **/
    public java.util.List<Scopes> getScopes() {
        return scopes;
    }

    /**
     * The packaging config resource identifier used to limit the scope of the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packagingConfigId")
    private final String packagingConfigId;

    /**
     * The packaging config resource identifier used to limit the scope of the token.
     * @return the value
     **/
    public String getPackagingConfigId() {
        return packagingConfigId;
    }

    /**
     * Array of asset resource IDs used to limit the scope of the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetIds")
    private final java.util.List<String> assetIds;

    /**
     * Array of asset resource IDs used to limit the scope of the token.
     * @return the value
     **/
    public java.util.List<String> getAssetIds() {
        return assetIds;
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
        sb.append("GenerateSessionTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", packagingConfigId=").append(String.valueOf(this.packagingConfigId));
        sb.append(", assetIds=").append(String.valueOf(this.assetIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateSessionTokenDetails)) {
            return false;
        }

        GenerateSessionTokenDetails other = (GenerateSessionTokenDetails) o;
        return java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(this.packagingConfigId, other.packagingConfigId)
                && java.util.Objects.equals(this.assetIds, other.assetIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result =
                (result * PRIME)
                        + (this.packagingConfigId == null ? 43 : this.packagingConfigId.hashCode());
        result = (result * PRIME) + (this.assetIds == null ? 43 : this.assetIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
