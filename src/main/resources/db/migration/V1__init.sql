CREATE TABLE IF NOT EXISTS motorcycle (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand TEXT NOT NULL,
    reference TEXT NOT NULL,
    mileage TEXT NOT NULL,
    subcategory TEXT NOT NULL,
    description TEXT
)