package com.so.picture.movie.service;

import com.so.picture.movie.entry.Mail;
import com.so.picture.movie.entry.ServerResponse;

public interface MqService {
    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
