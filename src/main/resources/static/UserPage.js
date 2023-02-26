/*
Скрипт заполняет таблицу все поля в navbar и таблицу About User для /admin и /user
 */
$(async function () {
    await loadUser();
});

async function loadUser() {
    fetch("http://localhost:8888/api/user")
        .then(r => r.json()) //читаем ответ в JSON
        .then(data => {
            //Заполняем таблицу полученными данными
            let user = `$(
            <tr>
                <td>${data.id}</td>
                <td>${data.email}</td>
                <td>${data.email}</td>
                <td>${data.email}</td>
                <td>${data.email}</td>
                <td>${data.role}</td>)`;
            //Вставляем все в тело таблицы
            $('#personalData').append(user);
        })
        //Выводим ошибку если что-то пошло не так
        .catch((error) => {
            alert(error);
        });
}




