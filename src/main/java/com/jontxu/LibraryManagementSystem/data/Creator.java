package com.jontxu.LibraryManagementSystem.data;

import java.time.LocalDate;

public record Creator(CreatorType creatorType, String name, String nationality, LocalDate birthDate) {
}
