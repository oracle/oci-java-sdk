/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Identity domain replication states.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DomainReplication.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DomainReplication {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("opcWaterMark")
        private java.math.BigDecimal opcWaterMark;

        public Builder opcWaterMark(java.math.BigDecimal opcWaterMark) {
            this.opcWaterMark = opcWaterMark;
            this.__explicitlySet__.add("opcWaterMark");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("txnSeqNumber")
        private java.math.BigDecimal txnSeqNumber;

        public Builder txnSeqNumber(java.math.BigDecimal txnSeqNumber) {
            this.txnSeqNumber = txnSeqNumber;
            this.__explicitlySet__.add("txnSeqNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainReplicationStates")
        private java.util.List<DomainReplicationStates> domainReplicationStates;

        public Builder domainReplicationStates(
                java.util.List<DomainReplicationStates> domainReplicationStates) {
            this.domainReplicationStates = domainReplicationStates;
            this.__explicitlySet__.add("domainReplicationStates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainReplication build() {
            DomainReplication __instance__ =
                    new DomainReplication(opcWaterMark, txnSeqNumber, domainReplicationStates);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainReplication o) {
            Builder copiedBuilder =
                    opcWaterMark(o.getOpcWaterMark())
                            .txnSeqNumber(o.getTxnSeqNumber())
                            .domainReplicationStates(o.getDomainReplicationStates());

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

    /**
     * The version number indicating the value of kievTxnId, starting from which the identity domain replication events need to be returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opcWaterMark")
    java.math.BigDecimal opcWaterMark;

    /**
     * A custom value defining the order of records with the same kievTxnId.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("txnSeqNumber")
    java.math.BigDecimal txnSeqNumber;

    /**
     * The identity domain's replication state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainReplicationStates")
    java.util.List<DomainReplicationStates> domainReplicationStates;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
