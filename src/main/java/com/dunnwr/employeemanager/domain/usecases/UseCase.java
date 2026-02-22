package com.dunnwr.employeemanager.domain.usecases;

public interface UseCase<I, O> {
    O execute(I input);
}
