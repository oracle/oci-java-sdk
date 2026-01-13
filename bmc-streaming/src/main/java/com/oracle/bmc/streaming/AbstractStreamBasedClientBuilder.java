/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.common.ClientBuilderBase;
import com.oracle.bmc.streaming.model.Stream;
import com.oracle.bmc.streaming.model.StreamSummary;

/**
 * A builder for a client that requires a stream.
 *
 * @param <B> actual class of the builder
 * @param <C> client class
 */
public abstract class AbstractStreamBasedClientBuilder<
                B extends AbstractStreamBasedClientBuilder, C>
        extends ClientBuilderBase<B, C> {
    protected Stream stream = null;
    protected StreamSummary streamSummary = null;

    /**
     * Set the stream. May be null
     *
     * @param stream the stream to use. May be null.
     * @return this builder
     */
    public B stream(Stream stream) {
        this.stream = stream;
        return (B) this;
    }

    /**
     * Set the stream summary. May be null
     *
     * @param streamSummary the stream summary to use. May be null
     * @return this builder
     */
    public B streamSummary(StreamSummary streamSummary) {
        this.streamSummary = streamSummary;
        return (B) this;
    }

    /** Creates a new {@code AbstractStreamBasedClientBuilder} object. */
    public AbstractStreamBasedClientBuilder(Service service) {
        super(service);
    }

    /**
     * Gets the endpoint that is either provided, defined within the stream, or defined within the
     * stream summary.
     *
     * @return the endpoint
     * @throws IllegalArgumentException if more than one endpoint is defined
     */
    protected String getEndpoint() {
        String streamEndpoint = null;

        // stream and stream summary are exclusive
        int endpointsProvided = 0;
        if (stream != null) {
            ++endpointsProvided;
        }
        if (streamSummary != null) {
            ++endpointsProvided;
        }
        if (endpoint != null) {
            ++endpointsProvided;
        }
        if (endpointsProvided != 1) {
            throw new IllegalArgumentException(
                    "Must provide exactly one of stream, stream summary, or endpoint");
        }

        if (stream != null) {
            streamEndpoint = stream.getMessagesEndpoint();
        }
        if (streamSummary != null) {
            streamEndpoint = streamSummary.getMessagesEndpoint();
        }
        if (endpoint != null) {
            streamEndpoint = endpoint;
        }
        return streamEndpoint;
    }

    /**
     * Set the values in this builder to be the same as in the provided other builder.
     *
     * @param fromBuilder other builder
     * @return this builder, with updated values
     */
    @Override
    public B copyFrom(B fromBuilder) {
        return (B)
                super.copyFrom(fromBuilder).stream(this.stream).streamSummary(this.streamSummary);
    }
}
