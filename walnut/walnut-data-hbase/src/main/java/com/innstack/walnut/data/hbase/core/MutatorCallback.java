package com.innstack.walnut.data.hbase.core;

import org.apache.hadoop.hbase.client.BufferedMutator;

public interface MutatorCallback {

    void doInMutator(BufferedMutator mutator) throws Throwable;
}
