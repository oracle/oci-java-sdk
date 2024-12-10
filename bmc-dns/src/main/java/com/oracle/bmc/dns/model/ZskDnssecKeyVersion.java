/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A zone signing key (ZSK) version. The version information contains timing and configuration data for the ZSK that is used to
 * apply DNSSEC on the zone.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ZskDnssecKeyVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ZskDnssecKeyVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "uuid",
        "algorithm",
        "lengthInBytes",
        "timeCreated",
        "timePublished",
        "timeActivated",
        "timeInactivated",
        "timeUnpublished",
        "timeExpired",
        "timePromoted",
        "predecessorDnssecKeyVersionUuid",
        "successorDnssecKeyVersionUuid",
        "keyTag"
    })
    public ZskDnssecKeyVersion(
            String uuid,
            DnssecSigningAlgorithm algorithm,
            Integer lengthInBytes,
            java.util.Date timeCreated,
            java.util.Date timePublished,
            java.util.Date timeActivated,
            java.util.Date timeInactivated,
            java.util.Date timeUnpublished,
            java.util.Date timeExpired,
            java.util.Date timePromoted,
            String predecessorDnssecKeyVersionUuid,
            String successorDnssecKeyVersionUuid,
            Integer keyTag) {
        super();
        this.uuid = uuid;
        this.algorithm = algorithm;
        this.lengthInBytes = lengthInBytes;
        this.timeCreated = timeCreated;
        this.timePublished = timePublished;
        this.timeActivated = timeActivated;
        this.timeInactivated = timeInactivated;
        this.timeUnpublished = timeUnpublished;
        this.timeExpired = timeExpired;
        this.timePromoted = timePromoted;
        this.predecessorDnssecKeyVersionUuid = predecessorDnssecKeyVersionUuid;
        this.successorDnssecKeyVersionUuid = successorDnssecKeyVersionUuid;
        this.keyTag = keyTag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The UUID of the {@code DnssecKeyVersion}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private String uuid;

        /**
         * The UUID of the {@code DnssecKeyVersion}.
         *
         * @param uuid the value to set
         * @return this builder
         **/
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            this.__explicitlySet__.add("uuid");
            return this;
        }
        /**
         * The signing algorithm used for the key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private DnssecSigningAlgorithm algorithm;

        /**
         * The signing algorithm used for the key.
         *
         * @param algorithm the value to set
         * @return this builder
         **/
        public Builder algorithm(DnssecSigningAlgorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /**
         * The length of the corresponding private key in bytes, expressed as an integer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lengthInBytes")
        private Integer lengthInBytes;

        /**
         * The length of the corresponding private key in bytes, expressed as an integer.
         *
         * @param lengthInBytes the value to set
         * @return this builder
         **/
        public Builder lengthInBytes(Integer lengthInBytes) {
            this.lengthInBytes = lengthInBytes;
            this.__explicitlySet__.add("lengthInBytes");
            return this;
        }
        /**
         * The date and time the key version was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the key version was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the key version was, or will be, published, expressed in RFC 3339 timestamp format. This is
         * when the zone contents will include a DNSKEY record corresponding to the key material.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * The date and time the key version was, or will be, published, expressed in RFC 3339 timestamp format. This is
         * when the zone contents will include a DNSKEY record corresponding to the key material.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timePublished the value to set
         * @return this builder
         **/
        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }
        /**
         * The date and time the key version went, or will go, active, expressed in RFC 3339 timestamp format. This is
         * when the key material will be used to generate RRSIGs.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
        private java.util.Date timeActivated;

        /**
         * The date and time the key version went, or will go, active, expressed in RFC 3339 timestamp format. This is
         * when the key material will be used to generate RRSIGs.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timeActivated the value to set
         * @return this builder
         **/
        public Builder timeActivated(java.util.Date timeActivated) {
            this.timeActivated = timeActivated;
            this.__explicitlySet__.add("timeActivated");
            return this;
        }
        /**
         * The date and time the key version went, or will go, inactive, expressed in RFC 3339 timestamp format. This
         * is when the key material will no longer be used to generate RRSIGs. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
         * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInactivated")
        private java.util.Date timeInactivated;

        /**
         * The date and time the key version went, or will go, inactive, expressed in RFC 3339 timestamp format. This
         * is when the key material will no longer be used to generate RRSIGs. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
         * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timeInactivated the value to set
         * @return this builder
         **/
        public Builder timeInactivated(java.util.Date timeInactivated) {
            this.timeInactivated = timeInactivated;
            this.__explicitlySet__.add("timeInactivated");
            return this;
        }
        /**
         * The date and time the key version was, or will be, unpublished, expressed in RFC 3339 timestamp format. This
         * is when the corresponding DNSKEY will be removed from zone contents. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
         * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUnpublished")
        private java.util.Date timeUnpublished;

        /**
         * The date and time the key version was, or will be, unpublished, expressed in RFC 3339 timestamp format. This
         * is when the corresponding DNSKEY will be removed from zone contents. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
         * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timeUnpublished the value to set
         * @return this builder
         **/
        public Builder timeUnpublished(java.util.Date timeUnpublished) {
            this.timeUnpublished = timeUnpublished;
            this.__explicitlySet__.add("timeUnpublished");
            return this;
        }
        /**
         * The date and time at which the recommended key version publication/activation lifetime ends, expressed in RFC
         * 3339 timestamp format. This is when the corresponding DNSKEY should no longer exist in zone contents and no
         * longer be used to generate RRSIGs. For a key sigining key (KSK), if {@code PromoteZoneDnssecKeyVersion} has not been called on this
         * {@code DnssecKeyVersion}'s successor then it will remain active for arbitrarily long past its recommended lifetime.
         * This prevents service disruption at the potential increased risk of key compromise.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * The date and time at which the recommended key version publication/activation lifetime ends, expressed in RFC
         * 3339 timestamp format. This is when the corresponding DNSKEY should no longer exist in zone contents and no
         * longer be used to generate RRSIGs. For a key sigining key (KSK), if {@code PromoteZoneDnssecKeyVersion} has not been called on this
         * {@code DnssecKeyVersion}'s successor then it will remain active for arbitrarily long past its recommended lifetime.
         * This prevents service disruption at the potential increased risk of key compromise.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timeExpired the value to set
         * @return this builder
         **/
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }
        /**
         * The date and time the key version was promoted expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePromoted")
        private java.util.Date timePromoted;

        /**
         * The date and time the key version was promoted expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:00Z}
         *
         * @param timePromoted the value to set
         * @return this builder
         **/
        public Builder timePromoted(java.util.Date timePromoted) {
            this.timePromoted = timePromoted;
            this.__explicitlySet__.add("timePromoted");
            return this;
        }
        /**
         * When populated, this is the UUID of the {@code DnssecKeyVersion} that this {@code DnssecKeyVersion} will replace or has
         * replaced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("predecessorDnssecKeyVersionUuid")
        private String predecessorDnssecKeyVersionUuid;

        /**
         * When populated, this is the UUID of the {@code DnssecKeyVersion} that this {@code DnssecKeyVersion} will replace or has
         * replaced.
         *
         * @param predecessorDnssecKeyVersionUuid the value to set
         * @return this builder
         **/
        public Builder predecessorDnssecKeyVersionUuid(String predecessorDnssecKeyVersionUuid) {
            this.predecessorDnssecKeyVersionUuid = predecessorDnssecKeyVersionUuid;
            this.__explicitlySet__.add("predecessorDnssecKeyVersionUuid");
            return this;
        }
        /**
         * When populated, this is the UUID of the {@code DnssecKeyVersion} that will replace, or has replaced, this
         * {@code DnssecKeyVersion}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("successorDnssecKeyVersionUuid")
        private String successorDnssecKeyVersionUuid;

        /**
         * When populated, this is the UUID of the {@code DnssecKeyVersion} that will replace, or has replaced, this
         * {@code DnssecKeyVersion}.
         *
         * @param successorDnssecKeyVersionUuid the value to set
         * @return this builder
         **/
        public Builder successorDnssecKeyVersionUuid(String successorDnssecKeyVersionUuid) {
            this.successorDnssecKeyVersionUuid = successorDnssecKeyVersionUuid;
            this.__explicitlySet__.add("successorDnssecKeyVersionUuid");
            return this;
        }
        /**
         * The key tag associated with the {@code DnssecKeyVersion}. This key tag will be present in the RRSIG and DS records
         * associated with the key material for this {@code DnssecKeyVersion}. For more information about key tags, see
         * [RFC 4034](https://tools.ietf.org/html/rfc4034).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyTag")
        private Integer keyTag;

        /**
         * The key tag associated with the {@code DnssecKeyVersion}. This key tag will be present in the RRSIG and DS records
         * associated with the key material for this {@code DnssecKeyVersion}. For more information about key tags, see
         * [RFC 4034](https://tools.ietf.org/html/rfc4034).
         *
         * @param keyTag the value to set
         * @return this builder
         **/
        public Builder keyTag(Integer keyTag) {
            this.keyTag = keyTag;
            this.__explicitlySet__.add("keyTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZskDnssecKeyVersion build() {
            ZskDnssecKeyVersion model =
                    new ZskDnssecKeyVersion(
                            this.uuid,
                            this.algorithm,
                            this.lengthInBytes,
                            this.timeCreated,
                            this.timePublished,
                            this.timeActivated,
                            this.timeInactivated,
                            this.timeUnpublished,
                            this.timeExpired,
                            this.timePromoted,
                            this.predecessorDnssecKeyVersionUuid,
                            this.successorDnssecKeyVersionUuid,
                            this.keyTag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZskDnssecKeyVersion model) {
            if (model.wasPropertyExplicitlySet("uuid")) {
                this.uuid(model.getUuid());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("lengthInBytes")) {
                this.lengthInBytes(model.getLengthInBytes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timePublished")) {
                this.timePublished(model.getTimePublished());
            }
            if (model.wasPropertyExplicitlySet("timeActivated")) {
                this.timeActivated(model.getTimeActivated());
            }
            if (model.wasPropertyExplicitlySet("timeInactivated")) {
                this.timeInactivated(model.getTimeInactivated());
            }
            if (model.wasPropertyExplicitlySet("timeUnpublished")) {
                this.timeUnpublished(model.getTimeUnpublished());
            }
            if (model.wasPropertyExplicitlySet("timeExpired")) {
                this.timeExpired(model.getTimeExpired());
            }
            if (model.wasPropertyExplicitlySet("timePromoted")) {
                this.timePromoted(model.getTimePromoted());
            }
            if (model.wasPropertyExplicitlySet("predecessorDnssecKeyVersionUuid")) {
                this.predecessorDnssecKeyVersionUuid(model.getPredecessorDnssecKeyVersionUuid());
            }
            if (model.wasPropertyExplicitlySet("successorDnssecKeyVersionUuid")) {
                this.successorDnssecKeyVersionUuid(model.getSuccessorDnssecKeyVersionUuid());
            }
            if (model.wasPropertyExplicitlySet("keyTag")) {
                this.keyTag(model.getKeyTag());
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
     * The UUID of the {@code DnssecKeyVersion}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    private final String uuid;

    /**
     * The UUID of the {@code DnssecKeyVersion}.
     *
     * @return the value
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * The signing algorithm used for the key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final DnssecSigningAlgorithm algorithm;

    /**
     * The signing algorithm used for the key.
     *
     * @return the value
     **/
    public DnssecSigningAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * The length of the corresponding private key in bytes, expressed as an integer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lengthInBytes")
    private final Integer lengthInBytes;

    /**
     * The length of the corresponding private key in bytes, expressed as an integer.
     *
     * @return the value
     **/
    public Integer getLengthInBytes() {
        return lengthInBytes;
    }

    /**
     * The date and time the key version was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the key version was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the key version was, or will be, published, expressed in RFC 3339 timestamp format. This is
     * when the zone contents will include a DNSKEY record corresponding to the key material.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * The date and time the key version was, or will be, published, expressed in RFC 3339 timestamp format. This is
     * when the zone contents will include a DNSKEY record corresponding to the key material.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimePublished() {
        return timePublished;
    }

    /**
     * The date and time the key version went, or will go, active, expressed in RFC 3339 timestamp format. This is
     * when the key material will be used to generate RRSIGs.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
    private final java.util.Date timeActivated;

    /**
     * The date and time the key version went, or will go, active, expressed in RFC 3339 timestamp format. This is
     * when the key material will be used to generate RRSIGs.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeActivated() {
        return timeActivated;
    }

    /**
     * The date and time the key version went, or will go, inactive, expressed in RFC 3339 timestamp format. This
     * is when the key material will no longer be used to generate RRSIGs. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
     * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInactivated")
    private final java.util.Date timeInactivated;

    /**
     * The date and time the key version went, or will go, inactive, expressed in RFC 3339 timestamp format. This
     * is when the key material will no longer be used to generate RRSIGs. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
     * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeInactivated() {
        return timeInactivated;
    }

    /**
     * The date and time the key version was, or will be, unpublished, expressed in RFC 3339 timestamp format. This
     * is when the corresponding DNSKEY will be removed from zone contents. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
     * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUnpublished")
    private final java.util.Date timeUnpublished;

    /**
     * The date and time the key version was, or will be, unpublished, expressed in RFC 3339 timestamp format. This
     * is when the corresponding DNSKEY will be removed from zone contents. For a key signing key (KSK) {@code DnssecKeyVersion}, this is
     * populated after {@code PromoteZoneDnssecKeyVersion} has been called on its successor {@code DnssecKeyVersion}.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUnpublished() {
        return timeUnpublished;
    }

    /**
     * The date and time at which the recommended key version publication/activation lifetime ends, expressed in RFC
     * 3339 timestamp format. This is when the corresponding DNSKEY should no longer exist in zone contents and no
     * longer be used to generate RRSIGs. For a key sigining key (KSK), if {@code PromoteZoneDnssecKeyVersion} has not been called on this
     * {@code DnssecKeyVersion}'s successor then it will remain active for arbitrarily long past its recommended lifetime.
     * This prevents service disruption at the potential increased risk of key compromise.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * The date and time at which the recommended key version publication/activation lifetime ends, expressed in RFC
     * 3339 timestamp format. This is when the corresponding DNSKEY should no longer exist in zone contents and no
     * longer be used to generate RRSIGs. For a key sigining key (KSK), if {@code PromoteZoneDnssecKeyVersion} has not been called on this
     * {@code DnssecKeyVersion}'s successor then it will remain active for arbitrarily long past its recommended lifetime.
     * This prevents service disruption at the potential increased risk of key compromise.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeExpired() {
        return timeExpired;
    }

    /**
     * The date and time the key version was promoted expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePromoted")
    private final java.util.Date timePromoted;

    /**
     * The date and time the key version was promoted expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:00Z}
     *
     * @return the value
     **/
    public java.util.Date getTimePromoted() {
        return timePromoted;
    }

    /**
     * When populated, this is the UUID of the {@code DnssecKeyVersion} that this {@code DnssecKeyVersion} will replace or has
     * replaced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("predecessorDnssecKeyVersionUuid")
    private final String predecessorDnssecKeyVersionUuid;

    /**
     * When populated, this is the UUID of the {@code DnssecKeyVersion} that this {@code DnssecKeyVersion} will replace or has
     * replaced.
     *
     * @return the value
     **/
    public String getPredecessorDnssecKeyVersionUuid() {
        return predecessorDnssecKeyVersionUuid;
    }

    /**
     * When populated, this is the UUID of the {@code DnssecKeyVersion} that will replace, or has replaced, this
     * {@code DnssecKeyVersion}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("successorDnssecKeyVersionUuid")
    private final String successorDnssecKeyVersionUuid;

    /**
     * When populated, this is the UUID of the {@code DnssecKeyVersion} that will replace, or has replaced, this
     * {@code DnssecKeyVersion}.
     *
     * @return the value
     **/
    public String getSuccessorDnssecKeyVersionUuid() {
        return successorDnssecKeyVersionUuid;
    }

    /**
     * The key tag associated with the {@code DnssecKeyVersion}. This key tag will be present in the RRSIG and DS records
     * associated with the key material for this {@code DnssecKeyVersion}. For more information about key tags, see
     * [RFC 4034](https://tools.ietf.org/html/rfc4034).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyTag")
    private final Integer keyTag;

    /**
     * The key tag associated with the {@code DnssecKeyVersion}. This key tag will be present in the RRSIG and DS records
     * associated with the key material for this {@code DnssecKeyVersion}. For more information about key tags, see
     * [RFC 4034](https://tools.ietf.org/html/rfc4034).
     *
     * @return the value
     **/
    public Integer getKeyTag() {
        return keyTag;
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
        sb.append("ZskDnssecKeyVersion(");
        sb.append("super=").append(super.toString());
        sb.append("uuid=").append(String.valueOf(this.uuid));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", lengthInBytes=").append(String.valueOf(this.lengthInBytes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", timeActivated=").append(String.valueOf(this.timeActivated));
        sb.append(", timeInactivated=").append(String.valueOf(this.timeInactivated));
        sb.append(", timeUnpublished=").append(String.valueOf(this.timeUnpublished));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
        sb.append(", timePromoted=").append(String.valueOf(this.timePromoted));
        sb.append(", predecessorDnssecKeyVersionUuid=")
                .append(String.valueOf(this.predecessorDnssecKeyVersionUuid));
        sb.append(", successorDnssecKeyVersionUuid=")
                .append(String.valueOf(this.successorDnssecKeyVersionUuid));
        sb.append(", keyTag=").append(String.valueOf(this.keyTag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZskDnssecKeyVersion)) {
            return false;
        }

        ZskDnssecKeyVersion other = (ZskDnssecKeyVersion) o;
        return java.util.Objects.equals(this.uuid, other.uuid)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.lengthInBytes, other.lengthInBytes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && java.util.Objects.equals(this.timeActivated, other.timeActivated)
                && java.util.Objects.equals(this.timeInactivated, other.timeInactivated)
                && java.util.Objects.equals(this.timeUnpublished, other.timeUnpublished)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
                && java.util.Objects.equals(this.timePromoted, other.timePromoted)
                && java.util.Objects.equals(
                        this.predecessorDnssecKeyVersionUuid, other.predecessorDnssecKeyVersionUuid)
                && java.util.Objects.equals(
                        this.successorDnssecKeyVersionUuid, other.successorDnssecKeyVersionUuid)
                && java.util.Objects.equals(this.keyTag, other.keyTag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uuid == null ? 43 : this.uuid.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.lengthInBytes == null ? 43 : this.lengthInBytes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result =
                (result * PRIME)
                        + (this.timeActivated == null ? 43 : this.timeActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInactivated == null ? 43 : this.timeInactivated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUnpublished == null ? 43 : this.timeUnpublished.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + (this.timePromoted == null ? 43 : this.timePromoted.hashCode());
        result =
                (result * PRIME)
                        + (this.predecessorDnssecKeyVersionUuid == null
                                ? 43
                                : this.predecessorDnssecKeyVersionUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.successorDnssecKeyVersionUuid == null
                                ? 43
                                : this.successorDnssecKeyVersionUuid.hashCode());
        result = (result * PRIME) + (this.keyTag == null ? 43 : this.keyTag.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
