/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;

/**
 * MultiPartTransferManager handles the job submission, cancellation, and completion of parts to the
 * manifest.
 */
public class MultipartTransferManager {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MultipartTransferManager.class);

    private static final int MAX_RANDOM_SLEEP_BEFORE_UPLOAD_START_MS = 1000;
    private final SecureRandom random = new SecureRandom();
    private final ExecutorService executor;
    private final MultipartManifestImpl manifest;
    private final ObjectStorage client;

    private final List<Future<Void>> responses = new ArrayList<>();

    public synchronized void startTransfer(final UploadPartRequest request) {
        if (executor.isShutdown()) {
            throw new CancellationException("Executor used for transfers has been shutdown");
        }
        manifest.registerTransfer(request.getUploadPartNum());

        Future<Void> futureResponse =
                executor.submit(
                        new Callable<Void>() {
                            @Override
                            public Void call() throws Exception {
                                try {
                                    // Use a random sleep before each part begins upload.  Too many
                                    // concurrent requests
                                    // starting around the same time leads to 409 conflicts.
                                    Thread.sleep(
                                            random.nextInt(
                                                    MAX_RANDOM_SLEEP_BEFORE_UPLOAD_START_MS));
                                    UploadPartResponse response = client.uploadPart(request);
                                    manifest.registerSuccess(request.getUploadPartNum(), response);
                                } catch (Exception e) {
                                    LOG.error(
                                            "Failed to upload part " + request.getUploadPartNum(),
                                            e);
                                    manifest.registerFailure(request.getUploadPartNum(), e);
                                }
                                return null;
                            }
                        });
        responses.add(futureResponse);
    }

    public void awaitCompletion() {
        for (Future<Void> f : responses) {
            try {
                f.get();
            } catch (InterruptedException e) {
                LOG.info("Thread interrupted while waiting for transfer completion", e);
                Thread.currentThread().interrupt();
                return;
            } catch (ExecutionException e) {
                LOG.info("Execution exception while waiting for transfer completion", e);
            }
        }
    }

    public void abortAll() {
        for (Future<Void> f : responses) {
            f.cancel(true);
        }
    }

    @java.beans.ConstructorProperties({"executor", "manifest", "client"})
    public MultipartTransferManager(
            final ExecutorService executor,
            final MultipartManifestImpl manifest,
            final ObjectStorage client) {
        this.executor = executor;
        this.manifest = manifest;
        this.client = client;
    }
}
